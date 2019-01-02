Feature: As a ops user I want to check available booking time

Scenario: Validate  Booking Time Availibility API

Given  Headers are provided and token will be extracted from authentication call

When Ops user sends a get request available times should be returned

Then get request should be success
