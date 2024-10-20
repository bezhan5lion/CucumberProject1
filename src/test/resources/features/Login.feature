Feature: Login Scenarios
#  If a user attempts to log in with an empty username field,
#  the system should display an error message stating "Username cannot be empty."
  Background:
    Given user is able to access HRM application
@userName
  Scenario: username is empty
    When user is able to enter username
    When user is able to enter password
    And user is able to click on the login button
    Then the system should display an error message that "username field cannot be empty"
  @password
  Scenario: password is empty
    When user is able to enter valid username
    When user is leaving password feild empty
    And user is able to click on the login button
    Then the system should display an error message that password field is empty
  @credentials
  Scenario: Invalid Credentials
    When user is able to enter invalid username
    When user is able to enter invalid password
    And user is able to click on the login button
    Then the system should displays invalid credentials message