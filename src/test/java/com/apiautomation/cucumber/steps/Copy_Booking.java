package com.apiautomation.cucumber.steps;
import static org.hamcrest.Matchers.equalTo;

import com.apiautomation.cucumber.utils.Payloads;
import com.apiautomation.cucumber.utils.ResuableMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;



public class Copy_Booking {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Home cleaning booking body parameters are given and access token will be extracted from authentication call$")
	
	public void givenparamaccesstoken()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(Payloads.copy_booking_payload());
	                
	}

@Step	
@When("^Ops user sends a post request and booking would be created$")

public void senddataaccesstoken()
{
	  response = request.
	   when().
	   post("/v1.0/booking/duplicate");
}

@Step
@Then("^Post request should be success$")

public void getaccesstoken()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}



}
