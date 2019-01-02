Feature: As a ops user I want to copy booking

Scenario: Validate that as a ops user booking can be copied

Given Home cleaning booking body parameters are given and access token will be extracted from authentication call

When Ops user sends a post request and booking would be created

Then Post request should be success
