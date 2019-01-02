Feature: As a PP user I want to get all country-city-area

Scenario: Validate get all country-city-area API for partner portal

Given Header parameters are given for country-city-area api call

When PP user sends a get request and api will return list of country-city-area

Then country-city-area get request should be success with status code 200