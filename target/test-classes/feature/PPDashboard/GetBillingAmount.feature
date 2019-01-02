Feature: To check Billing amount in Partner Portal Dashboard

Scenario: Verify billing amount on Partner Portal Dashboard

Given Header parameters are given for Get Billing Amount API

When request has been generated to get billing amoutn of partner

Then Get Billing Amount Api request should be success with status code 200