package pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETrequest {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification r = RestAssured.given();
	Response res = r.request(Method.GET,"/api/users/2");
	Singleuser s = res.as(Singleuser.class);
	Support support = s.getSupport();
	String text = support.getText();
	System.out.println(text);
	
	
	
	
}
}
