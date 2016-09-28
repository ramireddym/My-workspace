
@tag
Feature: Facebooklogin
	

@tag1
Scenario: validlogin
Given Url as"https://www.facebook.com" and browser as "Firefox"
When username is<email> And password is<password> And click loginButton
Then  Verify the facebook login
	|email                 |password|
	|ramireddy591@gmail.com|9989593467|
@tag2
Scenario: Invalidlogin
Given Url as"https://www.facebook.com" and browser as "IE"
When username is"ramireddy591@gmail.com" And password is"998953467" And click loginButton
Then  Display Error message

@tag3
Scenario: validlogin
Given Url as"https://www.facebook.com" and browser as "chrome"
When username is"9989593467" And password is"9989593467" And click loginButton
Then  Verify the facebook login
	

#@tag2
#Scenario Outline: validlogin
#Given Url as<url> and browser as <browser>
#When Username is <username> And Password is <password>
#Then I verify the <status> in step

#Examples:
# |url                     | browser | username                   | password   |status                   |
# |https://www.facebook.com| Firefox | ramireddy591@gmail.com     | 9989593467 |Verify the facebook login|
# |https://www.facebook.com| chrome  | ramireddy49@gmail.com      | 998959347  |Display Error message    |
