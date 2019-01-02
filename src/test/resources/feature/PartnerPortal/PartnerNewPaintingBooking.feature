Feature: As a PP user I want to see all New Painting Booking 

Scenario: Validate get all New Painting Booking for Partner Portal

Given Header parameters are given for New Painting Booking api call

When PP user sends a get request and api will return list of all New Painting Booking

Then all New Painting Booking get request should be success with status code 200