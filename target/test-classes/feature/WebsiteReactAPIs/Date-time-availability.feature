Feature: As a Web user I want to see available date and time 

Scenario: Validate available date and time for New React Website

Given Header parameters are given for available date and time api call

When Web user sends a get request and api will return list of all available date and time

Then available date and time get request should be success with status code 200