package P1_BasicHTTPRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;


public class ex3_PutRequest_Student {
	@Test
	public void TC1_UpdateStudentDetails() {
		LinkedHashMap data = new LinkedHashMap();
		data.put("id", "4");
		data.put("name", "ANIKET");
		data.put("location", "delhi");
		data.put("phone", "8806413310");
		
		String [] arr = {"c++" , "Python"};
		data.put("courses", arr);
		
		
		
		given()
		    .contentType("application/json")
		    .body(data)
		.when()
		   .put("http://localhost:3000/students/4")
		 .then()
		    .statusCode(200)
		    .log().all();
		
	}

}
