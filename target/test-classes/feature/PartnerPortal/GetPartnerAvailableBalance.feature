Feature: As a PP user I want to check my available balance

Scenario: Validate get my available balance API for partner portal

Given Header parameters are given for partner available balance 

When PP user sends a get request and api will return available balance

Then get request should be successfull