Feature: As a PP user I want to see all planned jobs

Scenario: Validate get all planned jobs for Partner Portal

Given Header parameters are given for planned jobs api call

When PP user sends a get request and api will return list of all planned jobs

Then planned job get request should be success with status code 200