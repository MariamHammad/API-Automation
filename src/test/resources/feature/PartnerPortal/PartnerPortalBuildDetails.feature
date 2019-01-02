Feature: As a PP user I want to get partner portal details 

Scenario: Validate get partner portal details API for partner portal

Given Header parameters are given for partner portal details api call

When PP user sends a get request and api will return Partner Portal Details

Then Partner Portal get request should be success with status code 200