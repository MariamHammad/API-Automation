Feature: As a PP user I want to see all leads assigned to me 

Scenario: Validate get partner all leads API 

Given Header parameters are given for all leads api call

When PP user sends a get request and api will return list of all leads to partner

Then all leads to partner get request should be success with status code 200