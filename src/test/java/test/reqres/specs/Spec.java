package test.reqres.specs;

import static io.restassured.RestAssured.with;

public class SpecForCreateUsers {

    public static RequestForCreateUsers requestForCreateUsers =
            with()
                    .baseUri("https://reqres.in/")
                    .contentType("application/json")
                    .put();

    public static ResponseForCreateUsers responseForCreateUsers =
            with()
                    .statusCode(201)
                    .log().body()
                    .put();
}
