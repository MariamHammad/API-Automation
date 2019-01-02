Feature: As a Web user I want to see all service providers 

Scenario: Validate get all service provider api for New React Website

Given Header parameters are given for service provider api call

When Web user sends a get request and api will return list of all service providers

Then Service Provider get request should be success with status code 200