package get_http_request;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.regex.Matcher;

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


        response.then().body("data[0].first_name", Matchers.equalTo("George")
                ,"data[0].last_name",Matchers.equalTo("Bluth"));


        response.then().body("data[1].email", Matchers.equalTo("janet.weaver@reqres.in"));
    }
}
