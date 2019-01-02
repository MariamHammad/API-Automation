Feature: As a PP user I want to see all open leads assigned to me 

Scenario: Validate get open partner leads API for partner portal

Given Header parameters are given for open leads api call

When PP user sends a get request and api will return list of all open leads assigned to partner

Then open leads to partner get request should be success with status code 200