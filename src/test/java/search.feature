Feature: Search
  Scenario: Searching for PCs with win 11 OS

    Given User go to amazon website
    When User accept the cookies
    And user click the all button
    And user click the computer button
    And user click the notebooks button
    And user click win11 home and win11 pro checkbox
    Then print the all prices at the current page