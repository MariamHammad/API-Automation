Feature: As a PP user I want to see all my workers 

Scenario: Validate get workers list 

Given Header parameters are given for workers list api call

When PP user sends a get request and api will return list of all workers

Then all workers list to partner get request should be success with status code 200