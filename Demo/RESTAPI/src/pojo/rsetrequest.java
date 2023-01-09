package pojo;

import  static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import restapi.requestspecbuilder;

public class rsetrequest {
public static RequestSpecification reqres()
{
	 RequestSpecBuilder respec = new RequestSpecBuilder();
	RequestSpecification rs=respec.setBaseUri("https://reqres.in/")
			.setContentType(ContentType.JSON).build();
	return rs;
}
	
	
	public static ResponseSpecification respec(int code)
	{
		ResponseSpecBuilder respec = new ResponseSpecBuilder();
	ResponseSpecification resp=respec.expectStatusCode(code).expectContentType(ContentType.JSON)
			.build();
	return resp;
	}

	
	
	public static void main(String[] args) {
		Response  res=given().spec(reqres()).get("/api/users/2").then()
				.spec(respec(200)).extract().response();
		String asString = res.asString();
		System.out.println(asString);
	}
	}


