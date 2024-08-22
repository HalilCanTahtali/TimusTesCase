Feature: Negatif Login
  Scenario Outline: Negatif login on amazon

    Given user go to amazon website
    When User click hello button
    And user type the "<phone>" phone
    And user click the next button for phone
    And user type the "<password>" password
    Then user click the next button for pass
    Examples:
      | phone                      | password |
      |asdfasdf                    |asdfasdf  |
      |asdfa123                    |asdfasdf  |
      |+905321765231               |passwordforTimus123.!*|
      |+905321765231               |asdfasdf  |
      |halilcantahtalii@gmail.com  |123321Aa. |