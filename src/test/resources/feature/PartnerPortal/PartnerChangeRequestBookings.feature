Feature: As a PP user I want to see all change request Booking 

Scenario: Validate get all change request Booking for Partner Portal

Given Header parameters are given for change request Booking api call

When PP user sends a get request and api will return list of all change request Booking

Then all change request Booking get request should be success with status code 200