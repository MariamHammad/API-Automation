Feature: To check the functionality Change Request list

Scenario: When Change request has been created then it should appear in Chanage Request grid in Ops

Given Header parameters are given for Get Change Request list api

When Admin post parameters of Change Request list

Then Get Change Request list request should be success with status code 200