
@tag
Feature:Gmail Login Functionality
# Background:
  #  Given browser as "Firefox" And URL as "https://www.gmail.com"
   



@tag4
Scenario Outline: Gmail Valid Login
Given browser as "Firefox" And URL as "https://www.gmail.com"
When user logs in using Username as <username> And Password <password>
Then login should be successful

Examples:
|username                |password        |
|mareddy697              |9704367212      |
|sivaramireddymareddy    |9989593467      |


