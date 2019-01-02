Feature: As a PP user I want to see my profile details 

Scenario: Validate get profile details API for partner portal

Given Header parameters are given for profile details api call

When PP user sends a get request and api will return profile details

Then profile details get request should be success with status code 200