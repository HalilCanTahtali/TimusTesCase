Feature: signin
  Scenario: signin at amazon

    Given user go to the amazon website
    When user click the welcome button
    And user click the create account button
    And user type name "name", email "mail@testfortimuscase.com", password "passTest123!." and repassword then click next button
    Then user click the start puzzle button