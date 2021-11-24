Feature: Login
#Scenario: Login with valid credentials
#Given user is on login page
#When user enters correct username
#When user enters username as "Admin"
#When user enters password as "admin123"
#And user enters correct password
#Then login successfull
#Scenario: Login with invalid credentials
#Given user is on login page
#When user enters incorrect username
#And user enters incorrect password
#Then login unsuccessfull
Scenario Outline: Validate Login with multiple users

Given user is on login page

When User enters username as  <username>

And User enters password as <password>

Then login successfull

Examples:
|username|password|
|Admin   |admin123|
|Tom     |tom123  |
