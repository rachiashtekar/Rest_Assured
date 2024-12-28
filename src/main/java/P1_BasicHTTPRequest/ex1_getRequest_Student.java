package P1_BasicHTTPRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ex1_getRequest_Student {
     @Test(priority=1)
	 public void Tc1_getAllDataStudent() {
		given()
		    .contentType("application/json")
		.when()
		    .get("http://localhost:3000/students/")
		.then()
		    .statusCode(200)
		    .log().all();



	}
    @Test(priority=2)
	public void Tc2_getSingleDataStudent() {
		given()
	    .contentType("application/json")
	.when()
	    .get("http://localhost:3000/students/2")
	.then()
	    .statusCode(200)
	    .log().all();
			
		}
    
	@Test(priority=3)
	public void Tc3_getInvalidDataStudent () {
		
		given()
	    .contentType("application/json")
	.when()
	    .get("http://localhost:3000/students/23")
	.then()
	    .statusCode(404)
	    .log().all();
		
	}


}
