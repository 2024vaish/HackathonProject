Feature: Form Registration

  Scenario: Navigate to form
    Given user should be on For Enterprise page
    When user clicks on solution dropdown
    And user click on For Campus option

  Scenario Outline: Fill The Form
    Given user should scroll down to the form
    When user fills the form with "<fname>","<lname>","<email>","<phone>","<InstName>","<needs>","<status>"
    And user submits the form
    And user captures "<status>" message
    Then user should close the browser
    

    Examples: 
      | fname | lname | email              | phone      | InstName | needs | status  |
      | test  | test  | test@cognizant.com | 9876545321 | test     | test  | valid   |
			|test1 	| test1	| test1							 | 7987898765	| test1		 | test1 | invalid |