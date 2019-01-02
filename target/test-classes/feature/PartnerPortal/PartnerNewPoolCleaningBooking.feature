Feature: As a PP user I want to see all New Pool cleaning Booking 

Scenario: Validate get all New Pool Cleaning Booking for Partner Portal

Given Header parameters are given for New Pool Cleaning Booking api call

When PP user sends a get request and api will return list of all New Pool Cleaning Booking

Then all New Pool Cleaning Booking get request should be success with status code 200