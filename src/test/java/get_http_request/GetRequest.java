package get_http_request;


import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void test01() {

        String url= "https://restful-booker.herokuapp.com/booking";

        Response response= given().when().get(url);

       // response.prettyPrint();

        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Content Type : "+response.contentType());
        System.out.println("Time : "+response.time());


        Assert.assertEquals(200,response.getStatusCode());
    }
}
