Feature: As a PP user I want to see all accepted Booking without worker

Scenario: Validate get all accepted Booking without worker for Partner Portal

Given Header parameters are given for accepted Booking without worker api call

When PP user sends a get request and api will return list of all accepted Booking without worker

Then all accepted Booking without worker get request should be success with status code 200