Feature: Login feature

Scenario: Login with valid credentials
Given I navigate to login page
When I enter username "Admin"
And And I enter password "admin123"
And I click on Submit button
And I click on search button and enter "Omkar"
Then I should be logged in successfully

