package com.apiautomation.cucumber.steps.newbookingengine;

import com.apiautomation.cucumber.utils.NewBookingEnginePayloads.AcceptChangeRequestPayload;
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


public class AllocatedPartner {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Allocated Partner of Booking$")
	
	public void allocatedpartnerparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(AcceptChangeRequestPayload.accept_changerequest_payload());
	                
	}

@Step	
@When("^Admin post a request for Allocated Partnerof booking$")

public void getallocatedpartner()
{
	  response = request.
	   when().
	   get("/v1.0/service-provider/48279/allocatedPartners");
}

@Step
@Then("^Allocated Partner request and should return status 200$")

public void allocatedpartners()
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
