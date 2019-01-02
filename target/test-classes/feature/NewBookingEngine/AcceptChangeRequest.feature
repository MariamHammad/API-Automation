Feature: To check Accept Change Request functionality
    
Scenario: To accept a change request of booking from Ops portal

Given Header parameters are given for Accept Change Request of Booking

When Admin post a request for Accept Change Request of booking

Then change request gets accpeted and should return status 200