package pojo231dec;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Serial30decstudent;


	public class Deserialization {
		@Test
		public void usingpostpojo() {
			 Pojoproductrequest pojo= new Pojoproductrequest();
			pojo.setTitle("fridge");
			pojo.setCategory("Electronics");
			pojo.setDescription("goodproduct");
			pojo.setPrice("1000");
			
			RestAssured.baseURI = "https://fakestoreapi.com/products";
			
			RequestSpecification req = RestAssured.given();
			req.contentType(ContentType.JSON).body(pojo);
			
			Response res = req.post();
			
			System.out.println(res.getStatusCode());
			System.out.println(res.getStatusLine());
			System.out.println(res.asPrettyString());
			System.out.println(res.getBody());
		}
	}