Feature: As a PP user I want to see all my transcation history 

Scenario: Validate get transcation history list 

Given Header parameters are given for transcation history api call

When PP user sends a get request and api will return list of all transcations

Then all transcations get request should be success with status code 200