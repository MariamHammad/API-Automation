Feature: As a Web user I want to see all service locations 

Scenario: Validate get all service location api for New React Website

Given Header parameters are given for service location api call

When Web user sends a get request and api will return list of all service locations

Then Service location get request should be success with status code 200