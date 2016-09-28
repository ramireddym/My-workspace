@tag
Feature: Gmail login	
@tag1
Scenario: valid login
Given URL as "https://www.gmail.com" and browser as "firefox"
When username is "ramireddy591@gmail.com"
	And password is "9666860641"
Then Verify Gmail Home Page

	@tag2
Scenario: Invalid login
Given URL as "https://www.gmail.com" and browser as "firefox"
When username is "ramireddy591@gmail.com"
	And password is "9666841"
Then show error message


@tag3
Scenario Outline: valid login
Given I open the application 
When I enter username as "<ramireddy591@gmail.com>
And  I enter username as "<9666860641>
Then I enter title as "<Gmail Home Page>"

@tag4
Scenario Outline: Invalid login
Given I open the application
When I enter username as "<ramireddy591@gmail.com>
And  I enter username as "<9666860641>
Then I enter title as "<Gmail Home Page>"

 Background:
    Given the user is on landing page
    When she chooses to sign up


