package test.reqres;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.reqres.models.lombok.createUser.CreateUserLombokModel;
import test.reqres.models.lombok.listResources.ListResourcesLombokModel;
import test.reqres.models.lombok.listUsers.ListUserLombokModel;
import test.reqres.models.lombok.loginSuccessful.LoginBodySuccessfulWithLombok;
import test.reqres.models.lombok.loginSuccessful.LoginResponseSuccessfulWithLombok;
import test.reqres.models.lombok.singleUser.SingleUserLombokModel;
import test.reqres.specs.Spec;

import static org.hamcrest.Matchers.is;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class ReqresApiTests extends TestBase {

    @Test
    void listUsers(){
        ListUserLombokModel data = new ListUserLombokModel();
        given()
                .spec(Spec.request)
                .when()
                .get("/users?page=2")
                .then()
                .spec(Spec.response)
                .extract().as(ListUserLombokModel.class);
        assertThat(data.getFirstName()).isEqualTo("Michael");
        assertThat(data.getLastName()).isEqualTo("Lawson");
        assertThat(data.getEmail()).isEqualTo("michael.lawson@reqres.in");
        assertThat(data.getId()).isEqualTo(7);
    }

    @Test
    @DisplayName("Check single user")
    void singleUser(){
        SingleUserLombokModel data = new SingleUserLombokModel();
        given()
                .spec(Spec.request)
                .when()
                .get("/users/2")
                .then()
                .spec(Spec.response)
                .extract().as(SingleUserLombokModel.class);
        assertThat(data.getFirst_name()).isEqualTo("Janet");
        assertThat(data.getId()).isEqualTo(2);
    }



    @Test
    @DisplayName("Check one resource")
    void listResources(){
        ListResourcesLombokModel data = new ListResourcesLombokModel();
        given()
                .spec(Spec.request)
                .when()
                .get("/unknown")
                .then()
                .spec(Spec.response)
                .extract().as(ListResourcesLombokModel.class);
        assertThat(data.getId()).isEqualTo(2);
        assertThat(data.getName1()).isEqualTo("fuchsia rose");
        assertThat(data.getName2()).isEqualTo("true red");
    }

    @Test
    @DisplayName("Check create user")
    void createUserSuccessful(){
        CreateUserLombokModel data = new CreateUserLombokModel();
        data.setName("morpheus");
        data.setJob("leader");

        given()
                .spec(Spec.request)
                .body(data)
                .when()
                .post("/users")
                .then()
                .spec(Spec.response)
                .extract().as(CreateUserLombokModel.class);

        assertThat(data.getName()).isEqualTo("morpheus");
        assertThat(data.getJob()).isEqualTo("leader");

    }

    @Test
    @DisplayName("Check login successful")
    void loginSuccessful() {
        LoginBodySuccessfulWithLombok data = new LoginBodySuccessfulWithLombok();
        data.setEmail("eve.holt@reqres.in");
        data.setPassword("cityslicka");

        LoginResponseSuccessfulWithLombok response = given()
                .spec(Spec.request)
                .body(data)
                .when()
                .post("/login")
                .then()
                .spec(Spec.response)
                .body("token", is("QpwL5tke4Pnpja7X4"))
                .extract().as(LoginResponseSuccessfulWithLombok.class);

        assertThat(response.getToken()).isEqualTo("QpwL5tke4Pnpja7X4");
    }


}

