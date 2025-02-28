package lesson17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PostmanEchoTests {

    @Test
    @DisplayName("Проверка метода GER request")
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        Response response = RestAssured
                .given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get");

        Assertions.assertEquals(200, response.getStatusCode());

        String foo1Value = response.jsonPath().getString("args.foo1");
        String foo2Value = response.jsonPath().getString("args.foo2");
        Assertions.assertEquals("bar1", foo1Value);
        Assertions.assertEquals("bar2", foo2Value);
    }

    @Test
    @DisplayName("Проверка метода POST Raw Text")
    public void testPostRawText() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .post("/post");

        Assertions.assertEquals(200, response.getStatusCode());

        String responseData = response.jsonPath().getString("data");
        Assertions.assertEquals(requestBody, responseData);
    }

    @Test
    @DisplayName("Проверка метода POST Form Data")
    public void testPostFormData() {
        RestAssured.baseURI = "https://postman-echo.com";
        Response response = RestAssured
                .given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post");

        Assertions.assertEquals(200, response.getStatusCode());

        String foo1Value = response.jsonPath().getString("form.foo1");
        String foo2Value = response.jsonPath().getString("form.foo2");
        Assertions.assertEquals("bar1", foo1Value);
        Assertions.assertEquals("bar2", foo2Value);
    }

    @Test
    @DisplayName("Проверка метода PUT Request")
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain; charset=UTF-8")
                .body(requestBody)
                .when()
                .put("/put");

        Assertions.assertEquals(200, response.getStatusCode());

        String responseData = response.jsonPath().getString("data");
        Assertions.assertEquals(requestBody, responseData);
    }

    @Test
    @DisplayName("Проверка метода PATCH Request")
    public void testPatchRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain; charset=UTF-8")
                .body(requestBody)
                .when()
                .patch("/patch");

        Assertions.assertEquals(200, response.getStatusCode());

        String responseData = response.jsonPath().getString("data");
        Assertions.assertEquals(requestBody, responseData);
    }

    @Test
    @DisplayName("Проверка метода DELETE Request")
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain; charset=UTF-8")
                .body(requestBody)
                .when()
                .delete("/delete");

        Assertions.assertEquals(200, response.getStatusCode());

        String responseData = response.jsonPath().getString("data");
        Assertions.assertEquals(requestBody, responseData);
    }
}
