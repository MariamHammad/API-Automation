Feature: To check Reject Change Request functionality
    
Scenario: To reject a change request of booking from Ops portal

Given Header parameters are given for Reject Change Request of Booking

When Admin post a request for Reject Change Request of booking

Then change request gets rejected and should return status 200