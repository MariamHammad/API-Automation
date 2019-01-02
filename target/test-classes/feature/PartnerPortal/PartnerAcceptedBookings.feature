Feature: As a PP user I want to see all accepted Booking 

Scenario: Validate get all accepted Booking for Partner Portal

Given Header parameters are given for accepted Booking api call

When PP user sends a get request and api will return list of all accepted Booking

Then all accepted Booking get request should be success with status code 200