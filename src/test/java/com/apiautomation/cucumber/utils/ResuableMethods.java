package com.apiautomation.cucumber.utils;

import net.serenitybdd.rest.SerenityRest;

public class ResuableMethods {

	
	
	
	
	public static String Ops_access_token()
	
	{
	
	
		String requestt =SerenityRest.rest()
	   .header("Accept", "application/json")

       .header("Content-Type", "application/x-www-form-urlencoded")
       .formParam("grant_type", "password")
       .formParam("client_id", "SM-IP-CLIENT")
       .formParam("username", "admin")
       .formParam("password","v3nturedive").
      
       when()
           .post("/oauth/token").
           
         then().assertThat().statusCode(200).and().
   		 extract().response().jsonPath().get("access_token");
	       
	  return requestt;
            
            
            
	}
	
public static String pp_access_token()
	
	{
	
	
		String requesttt =SerenityRest.rest()
	   .header("Accept", "application/json")

       .header("Content-Type", "application/x-www-form-urlencoded")
       .formParam("grant_type", "password")
       .formParam("client_id", "SM-PP-CLIENT")
       .formParam("username", "supremepcs")
       .formParam("password","test").
      
       when()
           .post("/oauth/token").
           
         then().assertThat().statusCode(200).and().
   		 extract().response().jsonPath().get("access_token");
	       
	  return requesttt;
	  
	  
	
}
public static String web_access_token()

{


	String WebAccessToken =SerenityRest.rest()
   .header("Accept", "application/json")

   .header("Content-Type", "application/x-www-form-urlencoded")
   .formParam("grant_type", "password")
   .formParam("client_id", "SM-WEB-CLIENT")
   .formParam("username", "mariam.hammad@venturedive.com")
   .formParam("password","mariam90").
  
   when()
       .post("/oauth/token").
       
     then().assertThat().statusCode(200).and().
		 extract().response().jsonPath().get("access_token");
       
  return WebAccessToken;
  
  

}
}
