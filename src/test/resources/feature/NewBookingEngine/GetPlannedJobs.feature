Feature: To check the functionality Get Planned Jobs

Scenario: When Booking gets confirm, we need to check accepted booking planned events in planned jobs in Ops

Given Header parameters are given for Get Planned Jobs api

When Admin post parameters for Get Planned Jobs List

Then Get Planned Jobs request should be success with status code 200