package P1_BasicHTTPRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class ex2_PostRequest_Students {
	@Test
	public void TC1_CreateNewStudentDetails() {
		LinkedHashMap data = new LinkedHashMap();
		data.put("id", "4");
		data.put("name", "aniket");
		data.put("location", "delhi");
		data.put("phone", "4457");
		
		String [] arr = {"c++" , "Python"};
		data.put("courses", arr);
		
		
		
		given()
		    .contentType("application/json")
		    .body(data)
		.when()
		   .post("http://localhost:3000/students")
		 .then()
		    .statusCode(201)
		    .log().all();
		
	}

}
