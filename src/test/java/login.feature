Feature: Login
  Scenario: Login to amazon website

    Given User go to the amazon website
    When User click the hello button
    And user type mail or phone and click button "+905321765231"
    And user type the password and click the button "16835292534Aa."
    Then check the url contains signin



    #Examples:
     # | phone       | password     |
     # |+905321765231|16835292534Aa.|
     # |+905333333333|123123123Aa.  |