package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get6 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response response = r.request(Method.GET,"/api/unknown/2");
		response.prettyPrint()
		/*String value1 = response.asString();
		System.out.println(value1)*/;
}
}