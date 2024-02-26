Feature: Sample
  Scenario Outline: Form Registration
    Given user should see the form.
    When user fills the details <fname>,<lname>,<email>,<phone>,<InstName>,<needs> 
    And user submits the form details
    Then user should print the <status> message

    Examples: 
      | fname  | lname | email  						|	phone			|	InstName	|	needs	|	status	|
      | test	 | test	 | test@cognizant.com |9876545321	|	test			|	test	|	valid		|
      | test1	 | test1 | test1					    |1234567898	|	test1			|	test1	|	invalid	|

