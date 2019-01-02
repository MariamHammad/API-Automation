package com.apiautomation.cucumber.steps.newbookingengine;

import com.apiautomation.cucumber.utils.NewBookingEnginePayloads.BookingChangeRequestPayload;
import com.apiautomation.cucumber.utils.ResuableMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;


public class BookingChangeRequest {
  
	

	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Create Booking Change Request api$")
	
	public void postchangerequestgparam()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("isCustomerLoggedIn", "true")
				.header("accessToken", ResuableMethods.Ops_access_token())
	            .contentType("application/json")
	            .body(BookingChangeRequestPayload.change_request_payload());
	                
	}

@Step	
@When("^Admin post a request for create booking change request$")

public void createchangerequest()
{
	  response = request.
	   when().
	   post("/v2/booking-change-request");
}

@Step
@Then("^Create booking change request should be success with status code 200$")

public void getchagerequestid()
{

	int req;
	response.then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).and()
	.body("success",equalTo(true));
	/*JsonPath jsonPathEvaluator = response.jsonPath();

	req= jsonPathEvaluator.get("data.id");
	System.out.println(req);

*/
	/*.body("operationMessage",equalTo("Operation completed successfully.")).and()
	.body("results", equalTo(1)).and()
	.header("Content-Encoding", "gzip").and()
	.header("Server", "Apache-Coyote/1.1");
	*/
}



}
