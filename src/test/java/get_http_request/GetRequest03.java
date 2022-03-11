package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest03 {


    @Test
    public void test03() {
        String url ="https://restful-booker.herokuapp.com/booking/7";
        Response response = given().when().get(url);

        response.prettyPrint();

      response.then().statusCode(200).contentType(ContentType.JSON);


        response
                .then()
                .assertThat()
                .body("firstname", Matchers.equalTo("Eric"),
                "lastname",Matchers.equalTo("Brown")
                        ,"bookingdates.checkin",Matchers.equalTo("2017-05-01") );

    }
}
