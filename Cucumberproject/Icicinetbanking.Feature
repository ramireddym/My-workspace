
@tag
Feature: Icicinetbankinglogin
@tag1
Scenario: Valid Icicinetbankinglogin
Given URL as "https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI" and browser as "firefox"
When  userid is "532673306"
	And password is"snehithareddy@3"
	And click the "button"
Then Verify Icicibanking Home Page
@tag2
Scenario: InValid Icicinetbankinglogin
Given URL as "https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI" and browser as "firefox"
When  userid is "532673306"
	And password is"snehreddy@3"
	And click the "button"
Then Verify error message "invalid password" displayed
	



