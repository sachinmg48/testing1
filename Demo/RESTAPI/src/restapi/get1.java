package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		/*Response response = r.request(Method.GET,"/api/users?page");
		String value = response.asString();
		System.out.println(value);*/
		Response response = r.request(Method.GET,"/api/users/2");
		String value1 = response.asString();
		System.out.println(value1);
	}
}
