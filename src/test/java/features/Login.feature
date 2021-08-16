Feature: Application Login 

Scenario: Home page default login 
Given User is on Netbanking login page 
When User login to application with "Jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login 
Given User is on Netbanking login page 
When User login to application with "John" and password "5678"
Then Home page is populated
And Cards displayed are "false"