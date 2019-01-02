package com.apiautomation.cucumber;

import org.junit.runner.RunWith;

import com.apiautomation.testbase.Testbase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/feature/NewBookingEngine")

public class APIrunner extends Testbase {
	
	

}
