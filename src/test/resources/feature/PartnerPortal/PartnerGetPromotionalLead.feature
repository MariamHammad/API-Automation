Feature: As a PP user I want to see all promotional leads assigned to me 

Scenario: Validate get partner promotional leads API 

Given Header parameters are given for all promotional leads api call

When PP user sends a get request and api will return list of all promotional leads to partner

Then all promotional leads to partner get request should be success with status code 200