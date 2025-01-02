package pojo231dec;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Mappojo {
  @Test
	public void usingpostmap() {
		 Map<String,String>m=new HashMap<>();
		 
		m.put("Title", "fridge");
		m.put("Category","Electronics");
		m.put("Description","goodproduct");
		m.put("Price","1000");
		RestAssured.baseURI = "https://fakestoreapi.com/products";
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON).body(m);
		
		Response res = req.post();
		
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		
		System.out.println(res.getBody().prettyPrint());
			}
}


