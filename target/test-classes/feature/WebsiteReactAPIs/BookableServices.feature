Feature: As a Web user I want to see all Bookable Services 

Scenario: Validate get all Bookable Services for New React Website

Given Header parameters are given for Bookable services api call

When Web user sends a get request and api will return list of all Bookable Services

Then all Bookable Services get request should be success with status code 200