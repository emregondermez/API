package get_http_request;


import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    @Test
    public void test01() {

        String url= "";

        Response response= given().when().get(url);

       // response.prettyPrint();

        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Content Type : "+response.contentType());
        System.out.println("Time : "+response.time());



        Assert.assertEquals(200,response.getStatusCode());


        response.then().assertThat().statusCode(200).contentType("application/json; charset=utf-8");

    }
}
