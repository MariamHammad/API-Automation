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

public class AvailableBookingTime {
	
	
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Headers are provided and token will be extracted from authentication call$")
	
	public void givenheaders()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .header("signedInUserId", "7")
	            .header("signedInCustomerId", "18560");
	            
	                
	}

@Step	
@When("^Ops user sends a get request available times should be returned$")

public void sendgetrequestfortime()
{
	  response = request.
	   when().
	   get("/v1.0/booking/date-time-availability");
}

@Step
@Then("^get request should be success$")

public void returnTimeSlots()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.body("size",equalTo(null)).and()
	.body("data.bookingTimings[0].description",equalTo("Default timings")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}


}
