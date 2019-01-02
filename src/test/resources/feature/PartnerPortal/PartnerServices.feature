Feature: As a PP user I want to get  Units

Scenario: Validate get  Unit API for partner portal

Given Header parameters are given for Unit API

When Partner portal user sends get request and api will return units

Then get request should be successfull with status code 200