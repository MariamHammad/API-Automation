package com.apiautomation.cucumber.steps.newbookingengine;

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


public class PendingConfirmationEvents {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Get Pending Confirmation Event list api$")
	
	public void pendingconfirmationparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json");

	                
	}

@Step	
@When("^Admin post parameters for Get Pending Confirmation Event list$")

public void getpendingconfirmation()
{
	  response = request.
	   when().
	   get("/v1.0/booking-event/list/BOOKING_EVENT_STATUS_PENDING_CONFIRMATION");
}

@Step
@Then("^Get Pending Confirmation Event list request should be success with status code 200$")

public void pendingconfirmation()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true));
	/*.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	*/
}



}
