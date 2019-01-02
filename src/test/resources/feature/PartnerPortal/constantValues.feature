
Feature: As a PP user I want to get all constants such as pool sizes

Scenario: Validate get all constants API for partner portal

Given Header parameters are given for constants api call

When PP user sends a get request and api will return list of all constants

Then constants get request should be success with status code 200