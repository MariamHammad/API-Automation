package com.apiautomation.cucumber.steps.PPDashboard;

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


public class GetLeadCount {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Get Lead Count API$")
	
	public void leadcountparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.pp_access_token())
	            .contentType("application/json");

	                
	}

@Step	
@When("^request has been generated to get Lead Count of partner$")

public void getleadcount()
{
	  response = request.
	   when().
	   get("/v1.0/service-provider/dashboard/lead-count");
}

@Step
@Then("^Get Lead Count Api request should be success with status code 200$")

public void leadcounts()
{
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true));
	/*body("operationMessage",equalTo("Operation Successful"));
	/*.body("results", equalTo(1)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	*/
}



}
