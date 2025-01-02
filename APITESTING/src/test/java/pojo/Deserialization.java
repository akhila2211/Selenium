package pojo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deserialization {
	@Test
	public void deerializationEx() {
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
        Response res = RestAssured.get("/user");
        
        Serial30decstudent data = res.as(Serial30decstudent.class);
        System.out.println("id = "+data.getName());
	}
}
