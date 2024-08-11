# This is feature file where we can use Gherkin language Given When Then
# And we should write step definitions for all these steps to get executed
# I have created stepDefinitions package where I have written all these steps.
#To check whether we have respctive step definition for the step is by pressing ctrl+click
#if not working then right click on project > Configure > Convert to Cucumber Project


Feature: Login feature

Scenario: Login with valid credentials
Given I navigate to login page
When I enter username "Admin"
And And I enter password "admin123"
And I click on Submit button
And I click on search button and enter "Omkar"
Then I should be logged in successfully

