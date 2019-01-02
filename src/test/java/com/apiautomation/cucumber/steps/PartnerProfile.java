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

public class PartnerProfile {

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for profile details api call$")
	
	public void GetPartnerProfile()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return profile details$")

public void getPartnerProfilecall()
{
	  response = request.
	   when().
	   get("v1.0/read/partner/profile");
}

@Step
@Then("^profile details get request should be success with status code 200$")

public void returnPartnerProfile()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Successful")).and()
	.body("data.id",equalTo(890)).and()
	.body("data.name",equalTo("Umair116")).and()
	.body("data.logo",equalTo("https://movesouq.s3.amazonaws.com/Movers_default_image.jpg")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}

	
}
