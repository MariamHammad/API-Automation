Feature: As a PP user I want to get all Services

Scenario: Validate get all services API for partner portal

Given Header parameters are given 

When PP user sends a get request and api will return list of all services

Then get request should be success with status code 200