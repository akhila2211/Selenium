package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Extractjsondec19 {
	

 @Test
	public void response() {
	RestAssured.baseURI="https://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification req=RestAssured.given();
	Response res=req.get("/Hyderabad");
	System.out.println(res.getBody().toString());
}
}