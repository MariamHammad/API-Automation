Feature: To check Booking Accept and Reject functionality
    
Scenario: To accept or reject a booking from Ops portal

Given Header parameters are given for Accept Reject Booking

When Admin post a request for Accept Reject booking

Then Booking gets accept reject and should return status 200