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

public class GetProviderAvailableBalance {
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for partner available balance$")
	
	public void getPPAvailablebalance()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return available balance$")

public void GetRemainingBalancecall()
{
	  response = request.
	   when().
	   get("v1.0/read/partner/get-available-balance");
}

@Step
@Then("^get request should be successfull$")

public void returnRemainingBalance()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("message",equalTo("Operation Successful")).and()
	.body("data.id", equalTo(931)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
}


}
