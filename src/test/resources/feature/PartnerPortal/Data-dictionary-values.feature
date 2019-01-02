Feature: As a PP user I want to get all Data-dictionary-values 

Scenario: Validate get all Data-dictionary-values API for partner portal

Given Header parameters are given for Data-dictionary-values api call

When PP user sends a get request and api will return list of all Data-dictionary-values

Then Data-dictionary-values get request should be success with status code 200