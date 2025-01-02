package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Headers17dec {

	@Test
	public void headers() {
		//RestAssured.given().when().get("https://www.google.com").then().header("Content-Type","text/html; charset=ISO-8859-1").and().header("Content-Encoding", "gzip").and().header("Server", "gws");
		
//		Response res = RestAssured.given().get("https://www.google.com");
//		System.out.println(res.getContentType());
//		System.out.println(res.header("Server"));
//		System.out.println(res.header("Content-Encoding"));
	}
	@Test
	public void flipkart() {
		Response res = RestAssured.given().get("https://www.flipkart.com/");
		System.out.println("content type : "+res.getContentType());
		System.out.println("server: "+ res.header("Server"));
		System.out.println("encoding : "+res.header("Content-Encoding"));
		   
//		        content type : text/html; charset=utf-8
//				server: nginx
//				encoding : gzip
		
	}
	@Test
	public void ammazon() {
		Response res = RestAssured.given().get("https://www.amazon.in/");
		System.out.println("content type : "+res.getContentType());
		System.out.println("server: "+ res.header("Server"));
		System.out.println("encoding : "+res.header("Content-Encoding"));
		
//		        content type : text/html;charset=UTF-8
//				server: Server
//				encoding : gzip
	}
	@Test
	public void Google() {
		Response res = RestAssured.given().get("https://www.google.in/");
		System.out.println("content type : "+res.getContentType());
		System.out.println("server: "+ res.header("Server"));
		System.out.println("encoding : "+res.header("Content-Encoding"));
	     
//		        content type : text/html; charset=ISO-8859-1
//				server: gws
//				encoding : gzip
	
	
	}
	
	@Test
	public void facebook() {
		Response res = RestAssured.given().get("https://www.facebook.com/");
		System.out.println("content type : "+res.getContentType());
		System.out.println("server: "+ res.header("Server"));
		System.out.println("encoding : "+res.header("Content-Encoding"));
	     
//		        content type : text/html; charset="utf-8"
//				server: null
//				encoding : gzip
		
	}

}
