Feature: As a PP user I want to see all my credit cards 

Scenario: Validate get credit cards list 

Given Header parameters are given for credit cards api call

When PP user sends a get request and api will return list of all credit cards

Then all credit cards get request should be success with status code 200