Feature: To check Pending Confirmation list in OPS

Scenario: When Booking gets confirm, and event date passes then that particular event should be in Pending Confimation grid in Ops

Given Header parameters are given for Get Pending Confirmation Event list api

When Admin post parameters for Get Pending Confirmation Event list

Then Get Pending Confirmation Event list request should be success with status code 200