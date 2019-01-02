Feature: As a Web user I want to claim Offers 

Scenario: Validate get claim Offers api for New React Website

Given Header parameters are given for Claim Offers api call

When Web user sends a get request and api will return offers

Then  Claim offers get request should be success with status code 200