Feature: As a Web user I want to see all constants for services 

Scenario: Validate get all constants Services for New React Website

Given Header parameters are given for constants services api call

When Web user sends a get request and api will return list of all constants

Then Constants get request should be success with status code 200