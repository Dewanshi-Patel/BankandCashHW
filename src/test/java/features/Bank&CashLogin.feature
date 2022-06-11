@Bank&CashFeature
Feature: TechFios bank and cash New Account Functionality

Background:
Given User is on Techfios login page

@BCScenario1
Scenario Outline: 1 User should be able to login with valid credentials
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks signin button
Then User should land on dashboard page
And User clicks on bankCash button
When User clicks newAccount
Then User enters accountTitle as "<accounttitle>"
Then User enters description as "<description>"
Then User enters initialBalance as "<initialbalance>"
Then User enters accountNumber as "<accountNumber>"
Then User enters contactPerson as "<contactPerson>"
Then User enters phoneNumber as "<phoneNumber>"
Then User enters internetBankingUrl as "<internetBankingUrl>"
Then User clicks on submit button
Then User should be able to see validate new account created



Examples:
|username|password|accounttitle|description|initialbalance|accountNumber|contactPerson|phoneNumber|internetBankingUrl|
|demo@techfios.com|abc123|Checking|DewanshiPatel|$32,253|12345|DewanshiPatel|884-569-7894|www.google.com|
