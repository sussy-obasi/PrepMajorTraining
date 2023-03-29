Feature: As a student i want register on prepmajor website


  Scenario:Valid registration
    Given I navigate to the url
    When  I enter username
    And I enter the email address
    And I enter the password
    And I enter the confirm password
    And I tick the term of use and privacy checkbox
    And I click the register button
    Then I validate that l am a successful registered
