package Base_Url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RegresInBaseUrl {

RequestSpecification spec01;

    public void setup() {
        spec01 = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();
    }
}
