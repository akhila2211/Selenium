package restassured;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Basictest9dec {

	@Test 
	public void getdetails() {
		RestAssured.baseURI="http://demowebshop.tricentis.com/books";
		
		RequestSpecification req=RestAssured.given();
		
		Response res=req.request(Method.GET,"");
		
	System.out.println(res.prettyPrint());
	
	System.out.println("time:"+res.getTime());
	System.out.println("comtent:"+res.getContentType());
	System.out.println("body:"+res.getBody());
	System.out.println("code:"+res.getStatusCode());
	System.out.println("cookies:"+res.getDetailedCookies());
	System.out.println("headers:"+res.getHeaders());
	}
	@Test
	public void mytest() {
		RestAssured.baseURI="http://demowebshop.tricentis.com";
		Response res=RestAssured.get("/computers");
		res.then().assertThat().statusCode(200);
		//res.then().assertThat().body("some.property", Equalty)
	}
	@Test
	//authentication
	public void auth() {
		//System.out.println(RestAssured.given().auth().basic("postmn", "password").get("https://postman-echo.com/basic-auth").body().asString());
		RequestSpecification req=RestAssured.given().auth().basic("postmn", "password");
		Response res =req.get("https://postman-echo.com/basic-auth");
		System.out.println(res.getStatusCode());
		res.then().assertThat().statusCode(200);
		
	}
	//using postmethod
	@Test
	public void usingpost() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification req=RestAssured.given();
		JSONObject params=new JSONObject();
		params.put("name", "akhila");
		params.put("dept", "testing");
		
		req.body(params);
		String url="api/users";
		req.header("Content-Type", "application/json");
		Response res=req.post(url);
		System.out.println(res.getStatusLine());
		//res.then().assertThat().statusCode(201);
		
	}
}

