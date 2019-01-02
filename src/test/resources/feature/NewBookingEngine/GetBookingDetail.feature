Feature: To check the functionality Get Booking details

Scenario: When Booking gets confirm, we need to check booking details in Ops

Given Header parameters are given for Get Booking details api

When Admin post parameters of booking to get its details

Then Get Booking details request should be success with status code 200