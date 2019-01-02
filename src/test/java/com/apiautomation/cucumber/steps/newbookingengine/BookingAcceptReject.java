package com.apiautomation.cucumber.steps.newbookingengine;

import com.apiautomation.cucumber.utils.Payloads;
import com.apiautomation.cucumber.utils.NewBookingEnginePayloads.BookingAcceptRejectPayload;
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


public class BookingAcceptReject {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Accept Reject Booking$")
	
	public void givenbookingparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(BookingAcceptRejectPayload.accept_reject_payload());
	                
	}

@Step	
@When("^Admin post a request for Accept Reject booking$")

public void acceptrejectbooking()
{
	  response = request.
	   when().
	   put("/v1.0/booking/confirmation");
}

@Step
@Then("^Booking gets accept reject and should return status 200$")

public void bookingconfirmation()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1));
	/*.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");*/
	
}



}
