package com.apiautomation.cucumber.steps.newbookingengine;

import com.apiautomation.cucumber.utils.NewBookingEnginePayloads.RejectChangeRequestPayload;
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


public class RejectChangeRequest {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Reject Change Request of Booking$")
	
	public void givenrejecttchangerequestparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(RejectChangeRequestPayload.reject_changerequest_payload());
	                
	}

@Step	
@When("^Admin post a request for Reject Change Request of booking$")

public void rejectchangerequest()
{
	  response = request.
	   when().
	   put("/v2/booking-change-request/reject");
}

@Step
@Then("^change request gets rejected and should return status 200$")

public void changerequestrejected()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true));
	/*.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1));
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");*/
	
}



}
