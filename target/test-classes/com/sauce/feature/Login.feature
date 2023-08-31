Feature: Test the login functionality of the Swaglabs.com

Scenario: Check wheather the user cant able to login with invalid credentials
	Given Launch the browser
	When Enter the URL
	And Enter the invalid username
	And Enter the invalid password
	And Click login 
	Then Validate wheather the login failed 

Scenario: Check wheather the user can able to login with valid credentials
	Given Launch browser
	When Enter URL
	And Enter the username
	And Enter the password
	And Click login btn
	Then Validate wheather the login passed 