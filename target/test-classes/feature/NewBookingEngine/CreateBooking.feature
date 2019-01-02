Feature: To check the functionality of Create Booking
    
Scenario: To create light weight booking from ops

Given Header parameters are given for Create Booking api

When Admin post a request for create booking

Then Create booking request request should be success with status code 200