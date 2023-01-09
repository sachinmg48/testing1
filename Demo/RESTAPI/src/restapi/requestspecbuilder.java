package restapi;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class requestspecbuilder {
public static void main(String[] args) {
	RequestSpecBuilder reqspecbuild=new RequestSpecBuilder();
	RequestSpecification rs = reqspecbuild
			.setBaseUri("https://reqres.in/")
			.setContentType(ContentType.JSON)
			.build();
	
	Response res= given().spec(rs)
			.when().get("/api/users/2")
			.then().statusCode(200).and().contentType(ContentType.JSON).extract().response();
	res.prettyPrint();
	
}
}
