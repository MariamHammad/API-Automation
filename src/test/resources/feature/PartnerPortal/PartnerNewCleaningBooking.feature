Feature: As a PP user I want to see all New cleaning Booking 

Scenario: Validate get all New Cleaning Booking for Partner Portal

Given Header parameters are given for New Cleaning Booking api call

When PP user sends a get request and api will return list of all New Cleaning Booking

Then all New Cleaning Booking get request should be success with status code 200