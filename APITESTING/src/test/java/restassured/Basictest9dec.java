package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
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
}
