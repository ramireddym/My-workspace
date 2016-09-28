
@tag
Feature: 160by2 login
 Background:
    Given url as "http://www.160by2.com/Index" browser as "Firefox"

@tag1
Scenario: valid login
#Given url as "http://www.160by2.com/Index" browser as "Firefox"
When username is"9989593467" And password is"ramireddy" And click  loginButton
Then Verify the 160by2 login success
@tag2
Scenario: Invalid login
#Given url as "http://www.160by2.com/Index" browser as "Firefox"
When username is"9989593467" And password is"ramireddi" And click  loginButton
Then Verify the 160by2 login Fail


#@tag3
#Scenario Outline: Check login
#Given url as <Url> browser as<Browser>
#When username is<Username> And password is<Password>
#Then  verify the <status> 

#Examples:
    #| Url                        |Browser  |Username  |Password  | status |
    #|http://www.160by2.com/Index | Firefox |9989593467|9989593467| success|
    #|http://www.160by2.com/Index | chrome  |9989593467|998959467 | Fail   |
