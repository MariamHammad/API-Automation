package com.apiautomation.cucumber.steps;

import static org.hamcrest.Matchers.equalTo;

import com.apiautomation.cucumber.utils.ResuableMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;




public class PartnerBookingEventPaidAndDelivered {
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for paid and delivered booking events api call$")
	
	public void GetPartnerPaidAndDeliveredBookingEvents()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("signedInUserId", "19276")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all paid and delivered booking events$")

public void getPartnerPaidAndDeliveredBookingEventcall()
{
	  response = request.
	   when().
	   get("v1.0/bookingEvent/supplier?bookingEventStatus=BOOKING_EVENT_STATUS_DELIVERED_AND_PAID");
}

@Step
@Then("^paid and delivered booking events get request should be success with status code 200$")

public void returnAllPaidAndDeliveredBookingEvents()
{
	response.then().assertThat()
	.statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Completed Successfully. 49 result(s) returned")).and()
	.body("data[0].bookingId",equalTo(26203)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
	
}

}
