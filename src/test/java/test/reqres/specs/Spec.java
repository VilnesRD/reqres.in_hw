package test.reqres.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;
import static test.reqres.helpers.CustomApiListener.withCustomTemplates;

public class Spec {

    public static RequestSpecification request = with()
            .log().uri()
            .filter(withCustomTemplates());

    public static ResponseSpecification response = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();
}
