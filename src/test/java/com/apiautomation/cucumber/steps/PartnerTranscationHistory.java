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

public class PartnerTranscationHistory {
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for transcation history api call$")
	
	public void GetPartnerTranscationHistory()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all transcations$")

public void getPartnerTranscationHistorycall()
{
	  response = request.
	   when().
	   get("v1/transaction/history");
}

@Step
@Then("^all transcations get request should be success with status code 200$")

public void returnAllTranscations()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}

}
