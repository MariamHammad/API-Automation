Feature: As a PP user I want to see all on hold booking events

Scenario: Validate get all on hold booking events for Partner Portal

Given Header parameters are given for on hold booking events api call

When PP user sends a get request and api will return list of all on hold booking events

Then on hold booking events get request should be success with status code 200