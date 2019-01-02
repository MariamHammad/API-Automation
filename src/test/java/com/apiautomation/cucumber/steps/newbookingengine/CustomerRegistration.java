package com.apiautomation.cucumber.steps.newbookingengine;

import com.apiautomation.cucumber.utils.NewBookingEnginePayloads.CustomerRegistrationPayload;
import com.apiautomation.cucumber.utils.ResuableMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;


public class CustomerRegistration {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Customer Registration api call")
	
	public void postcustomerregistrationparams()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(CustomerRegistrationPayload.customer_registration_payload());
	                
	}

@Step	
@When("^Admin post a request of Customer Registration$")

public void registercustomer()
{
	  response = request.
	   when().
	   post("v2/customer/validate-and-register");
}

@Step
@Then("^Customer Registration request should be success with status code 200$")

public void getcusomerid()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true));
	/*.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");*/
	
}



}
