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

public class Datadictionaryvalues {
	
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Data-dictionary-values api call$")
	
	public void GetPPDataValues()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all Data-dictionary-values$")

public void getdataValuecall()
{
	  response = request.
	   when().
	   get("v1.0/read/data-dictionary-values");
}

@Step
@Then("^Data-dictionary-values get request should be success with status code 200$")

public void returndataValues()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Completed Successfully. 62 result(s) returned")).and()
	.body("data.category[0]", equalTo("additional_rooms")).and()
	.body("data.category[1]", equalTo("booking_allocation_confirmation_status")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}


}
