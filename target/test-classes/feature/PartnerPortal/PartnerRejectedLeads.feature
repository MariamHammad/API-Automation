Feature: As a PP user I want to see all rejected leads assigned to me 

Scenario: Validate get partner rejected leads API 

Given Header parameters are given for rejected leads api call

When PP user sends a get request and api will return list of all rejected leads to partner

Then rejected leads to partner get request should be success with status code 200