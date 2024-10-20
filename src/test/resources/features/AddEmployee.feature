Feature: Adding Employee

  Background:
    Given user is able to access HRM application with valid user name and password
  @withoutID
  Scenario: Adding Employee without unique ID,
    When uers is able to add "firstname" then "middlename" and "lastname"
    And user clicks the save buttonScenario:
   @withID
  Scenario: Adding Employee with unique ID,
    When uers is able to add "firstname" then "middlename", "lastname" and "ID"
    And user clicks the save button

