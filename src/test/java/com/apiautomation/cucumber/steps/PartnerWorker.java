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

public class PartnerWorker {

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for workers list api call$")
	
	public void GetPartnerWorkers()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("providerId", "890")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all workers$")

public void getPartnerWorkercall()
{
	  response = request.
	   when().
	   get("v1.0/service-provider/workers");
}

@Step
@Then("^all workers list to partner get request should be success with status code 200$")

public void returnWorkers()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.body("data.workerId[0]",equalTo(805)).and()
	.body("data.workerId[1]",equalTo(807)).and()
	.body("data.nickName[0]",equalTo("carrol")).and()
	.body("data.nickName[1]",equalTo("Mark")).and()
	.body("data.isBlacklisted[1]",equalTo(false)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	
}
}
