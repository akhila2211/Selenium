package restassured;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//private static Map<String, set<?>> data=new HashMap<String>
public class Post12dec {
	@Test 
	public void getdetails() {
		RestAssured.baseURI="http://reqres.in/";
		
		RequestSpecification req=RestAssured.given();
		
		Response res=req.request(Method.GET,"");
		System.out.println(res.prettyPrint());
		//System.out.println(res.getBody());
		//System.out.println(res.asPrettyString());
		
		
	}
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
	res.then().assertThat().statusCode(201);
	RestAssured.baseURI="http://demowebshop.tricentis.com/books";
	
	

	
}	
}
