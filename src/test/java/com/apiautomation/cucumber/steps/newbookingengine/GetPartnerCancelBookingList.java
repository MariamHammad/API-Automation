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


public class GetPartnerCancelBookingList {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Get Partner Cancel Booking list api$")
	
	public void getpartnerdetailsparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");

	                
	}

@Step	
@When("^Admin post parameters to get Cancel booking list of partner$")

public void getpartnercancelbookinglist()
{
	  response = request.
	   when().
	   get("/v1.0/read/partner/getBookingLists?bookingType=CANCELLED_BOOKINGS");
}

@Step
@Then("^Get Cancel Booking List request should be success with status code 200$")

public void partnercancelbookinglist()
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
