Feature: Login to sauce demo
  Scenario Outline:
    Given user is on the login page
    And user enter username <username>
    And user enters password <password>
    Then user click on login button
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |