package P1_BasicHTTPRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class ex4_DeleteRequest_Student {
	@Test
	public void TC_DeleteStudentDetail() {
		given()
		.contentType("application/json")
		.when()
		  .delete("http://localhost:3000/students/4")
		 .then()
		   .statusCode(200)
		   .log().all();
		
		
	}

}
