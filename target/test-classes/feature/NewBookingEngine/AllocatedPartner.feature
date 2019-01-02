Feature: To check Allocated Partner functionality
    
Scenario: To verify allocated partner to the newly created booking from Ops portal

Given Header parameters are given for Allocated Partner of Booking

When Admin post a request for Allocated Partnerof booking

Then Allocated Partner request and should return status 200