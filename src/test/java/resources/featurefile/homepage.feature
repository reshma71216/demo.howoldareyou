Feature: Age Calculation

  Scenario: Valid name and invalid birthday entered
    Given user is on homepage of given url
    When user enter name in username textbox
    And user enter invalid birthdate in birthday textbox
    And user click on submit button
    Then user verify "you are too old to use it" error message