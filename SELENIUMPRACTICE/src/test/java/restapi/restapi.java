package restapi;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class restapi {
@Test

public static void getApi() {
	String url="https://reqres.in/api/users?page=2";
	RestAssured.given().when().get(url).then().statusCode(200).log().all();
}
@Test
void post() {
	String url="https://reqres.in/api/users";
	HashMap<String,String> data=new HashMap<>();
	data.put("name", "morpheus");
	data.put("job", "leader");
	RestAssured.given().contentType("application/json").body(data).when().post(url).then().statusCode(201).log().all();
	Assert.assertEquals(data.get("name"), "morpheus");
	Assert.assertEquals(data.get("job"), "leader");
	
}
@Test
void put() {
	String url="https://reqres.in/api/users/2";
	HashMap<String,String> data=new HashMap<String, String>();
	data.put("name", "morpheus");
	data.put("job", "zion resident");
	RestAssured.given().contentType("application/json").body(data).when().put(url).then().statusCode(200).log().all();
	Assert.assertEquals(data.get("name"), "morpheus");
	Assert.assertEquals(data.get("job"), "zion resident");
	
}
@Test
void patch () {
	String url="https://reqres.in/api/users/2";
	HashMap<String,String> data=new HashMap<String, String>();
	data.put("name", "morpheus");
	data.put("job", "zion resident");
	RestAssured.given().contentType("application/json").body(data).when().patch(url).then().statusCode(200).log().all();
	Assert.assertEquals(data.get("name"), "morpheus");
	Assert.assertEquals(data.get("job"), "zion resident");
	
}
@Test
void delete() {
	
	String url="https://reqres.in/api/users/2";
	RestAssured.given().when().delete(url).then().statusCode(204).log().all();
}
}

