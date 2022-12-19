package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class Steps {
	 private final String BASE_URL = "https://petstore.swagger.io/v2";
	 private Response response ;


	@Given("user wants to know the {string} of the pet")
	public void user_wants_to_know_the_of_the_pet(String Status) {
		RequestSpecification requestspecification = RestAssured.given() ;
		requestspecification.queryParam("status", Status);
		
	 
	}

//	@When("Get api is called using {string}")
//	public void get_api_is_called_using(String URI) throws URISyntaxException  {
//	RestAssured.baseURI = BASE_URL;
//	RequestSpecification requestspecification = RestAssured.given();
//	response = requestspecification.when().get(new URI(URI));
//	System.out.println("response : "+ response.asString());
//	
//	}


@When("Get api is called using {string} with  {string}")
public void get_api_is_called_using_with(String URI, String Status) {
	RestAssured.baseURI = BASE_URL;
	RequestSpecification requestspecification = RestAssured.given();
	response = requestspecification.queryParam("status", Status).get(URI);
	System.out.println("response : "+ response.asString());

	
}

	@Then("I verify the {int} in step")
	public void i_verify_the_in_step(Integer statusCode) {
		Integer actualResponseCode = response.then().extract().statusCode();
		System.out.println(actualResponseCode);
		//Assert.assertEquals(statusCode,actualResponseCode);
		assertEquals(statusCode,actualResponseCode);
//		Assert.assertEquals(statusCode, actualResponseCode);
		

	}




}
