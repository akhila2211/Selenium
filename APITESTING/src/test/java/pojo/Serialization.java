package pojo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Serialization {
	@Test
	public void serializationEx() {
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
		Serial30decstudent s = new Serial30decstudent();
		s.setName("akhila");
		
		//creating user
		Response res = RestAssured.given().contentType(ContentType.JSON).body(s).when().post("/users");
		
		
		//getting response code
		System.out.println(res.getStatusCode());
		
		
		//validating
		res.then().assertThat().statusCode(201);
	}
}
