package test.reqres;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static test.reqres.helpers.CustomApiListener.withCustomTemplates;


public class TestBase {
    @BeforeAll
    public static void setUp() {
        RestAssured.filters(withCustomTemplates());
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }
}