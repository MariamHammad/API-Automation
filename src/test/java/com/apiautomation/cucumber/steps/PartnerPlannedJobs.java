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

public class PartnerPlannedJobs {
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for planned jobs api call$")
	
	public void GetPartnerPlannedJobs()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("signedInUserId", "19276")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all planned jobs$")

public void getPartnerPlannedJobs()
{
	  response = request.
	   when().
	   get("v1.0/bookingEvent/supplier?bookingEventStatus=BOOKING_EVENT_STATUS_PLANNED");
}

@Step
@Then("^planned job get request should be success with status code 200$")

public void returnAllPlannedJobs()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Completed Successfully. 2304 result(s) returned")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}

}
