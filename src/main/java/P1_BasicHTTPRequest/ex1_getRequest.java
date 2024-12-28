package P1_BasicHTTPRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ex1_getRequest {
	@Test
	public void TC() {
		given()               //pre-request
		.contentType("application/json")
		
		.when()                //req-type
		.get("https://reqres.in/api/users?page=2")
		
		.then()                //validation
		.statusCode(200)
		//.log().body();   //it will print the data
		.log().all();         //it will print evrything like body,status code
		
		
		
		
		
		
	}

}
