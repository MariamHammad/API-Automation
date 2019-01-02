Feature: As a PP user I want to see all accepted leads assigned to me 

Scenario: Validate get partner accepted leads API 

Given Header parameters are given for accepted leads api call

When PP user sends a get request and api will return list of all accepted leads to partner

Then accepted leads to partner get request should be success with status code 200