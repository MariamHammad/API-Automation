package com.apiautomation.cucumber.steps.websitereactapis;

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

public class BookingEventChangeRequest {
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for booking event Change request api call$")
	
	public void GetBookingEventChangeDetailsHeaders()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.web_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^Web user sends a get request and api will return booking event Change request$")

public void getBookingEventChangeDetailsrequest()
{
	  response = request.
	   when().
	   get("v1.0/booking-change-request/event/1");
}

@Step
@Then("^booking event Change request get request should be success with status code 200$")

public void returnBookingEventChangeDetails()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
}


}
