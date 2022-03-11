package get_http_request;


import io.restassured.response.Response;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest06 {

     /*
    https://restful-booker.herokuapp.com/booking/5 url'ine
    accept type'i "application/json" olan GET request'i yolladigimda
    gelen response'un
    status kodunun 200
    ve content type'inin "application/json"
    ve firstname'in “Jim"
    ve totalprice’in 600
    ve checkin date'in 2015-06-12"oldugunu test edin
     */

    @Test
    public void test01() {

        String url = "https://restful-booker.herokuapp.com/booking/5";
        Response response = given().when().get(url);

        response.then().statusCode(200).contentType("application/json");
        response.prettyPrint();

        response
                .then()
                .body("firstname", equalTo("Jim")
                        ,"totalprice",equalTo(685)
                        ,"bookingdates.checkin",equalTo("2019-07-26"));







    }
}
