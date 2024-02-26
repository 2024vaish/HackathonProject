Feature: IdentifyCourses

  Scenario: Search For Courses
    Given user should be on courseera homepage
    When user search for "Web Development" courses
    And user clicks on show more link
    And user select English language
    And user select beginners level
    Then user should click on top two courses
    
