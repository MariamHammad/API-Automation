package com.apiautomation.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class Testbase {
	
	@BeforeClass
	
	public static void init()
	{
		RestAssured.baseURI="https://uat1-api.servicemarket.com";
	}

}

