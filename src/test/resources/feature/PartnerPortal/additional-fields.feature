Feature: As a PP user I want to get all additional-fields-values 

Scenario: Validate get all additional-fields-values API for partner portal

Given Header parameters are given for additional-fields-values api call

When PP user sends a get request and api will return list of all additional-fields-values

Then additional-fields-values get request should be success with status code 200