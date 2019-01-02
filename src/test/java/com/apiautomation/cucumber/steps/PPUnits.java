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

public class PPUnits {

	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Unit API$")
	
	public void GetPPUnits()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^Partner portal user sends get request and api will return units$")

public void getunitcall()
{
	  response = request.
	   when().
	   get("v1.0/quote/units");
}

@Step
@Then("^get request should be successfull with status code 200$")

public void returnUnits()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
}


}

	

