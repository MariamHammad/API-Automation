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

public class PartnerNewWindowCleaningBooking {
	
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for New window Cleaning Booking api call$")
	
	public void GetPartnerNewWindowCleaningBooking()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all New window Cleaning Booking$")

public void getPartnerNewWindowCleaningBookingcall()
{
	  response = request.
	   when().
	   get("v1.0/read/partner/getBookingLists?bookingType=NEW_WINDOW_CLEANING_BOOKINGS");
}

@Step
@Then("^all New window Cleaning Booking get request should be success with status code 200$")

public void returnAllNewWindowCleaningBooking()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Completed Successfully. 4 result(s) returned")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}


}
