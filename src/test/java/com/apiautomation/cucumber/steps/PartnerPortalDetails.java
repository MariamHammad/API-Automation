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

public class PartnerPortalDetails {

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for partner portal details api call$")
	
	public void GetPartnerPortalDetails()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return Partner Portal Details$")

public void getPartnerPortalcall()
{
	  response = request.
	   when().
	   get("v1.0/mobile/1.9.8.1/PARTNER_PORTAL");
}

@Step
@Then("^Partner Portal get request should be success with status code 200$")

public void returnPartnerPortalDetails()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.body("data.id",equalTo(108)).and()
	.body("data.isActive",equalTo(true)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}
	
}
