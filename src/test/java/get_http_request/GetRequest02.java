package get_http_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest02 {


    @Test
    public void test01() {

        String url = "https://reqres.in/api/users";

        Response response = given().when().get(url);

        response.prettyPrint();  // --> response deki body yi getirir

     //   response.prettyPeek();  //  --> response deki herseyi getirir


      //  response.then().log().all();   //  --> response deki herseyi getirir

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK");

    }
}
