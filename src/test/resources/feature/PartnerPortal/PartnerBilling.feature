Feature: As a PP user I want to see billing 

Scenario: Validate get billing API 

Given Header parameters are given for billings api call

When PP user sends a get request and api will return list of all billings to partner

Then all billing leads to partner get request should be success with status code 200