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

public class PartnerRejectedLeads {
	
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for rejected leads api call$")
	
	public void GetPartnerRejectedLeads()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");
	            
	                
	}

@Step	
@When("^PP user sends a get request and api will return list of all rejected leads to partner$")

public void getPartnerRejectedLeadcall()
{
	  response = request.
	   when().
	   get("v1.0/leads?status=REJECTED");
}

@Step
@Then("^rejected leads to partner get request should be success with status code 200$")

public void returnRejectedLeads()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true)).and()
	.body("status",equalTo("OK")).and()
	.body("data.referenceId[0]",equalTo("20180424000003HPDXB")).and()
	.body("data.requestId",equalTo(70557)).and()
	.body("data.serviceId",equalTo(108)).and()
	.body("data.serviceName",equalTo("Home Painting")).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
}

}
