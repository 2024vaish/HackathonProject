Feature: Language learning

Scenario: Extract language and levels
		Given user should be on homepage
		When User look for "Language Learning"
		And user clicks on show more link
		And user extract all languages
		And user extract all levels
		Then user display langauge and level information
		
		
	