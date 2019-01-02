Feature: As a PP user I want to see all paid and delivered booking events

Scenario: Validate get all paid and delivered booking events for Partner Portal

Given Header parameters are given for paid and delivered booking events api call

When PP user sends a get request and api will return list of all paid and delivered booking events

Then paid and delivered booking events get request should be success with status code 200