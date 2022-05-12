Feature: Feature to test login functionality
  @smoketest
  Scenario: Check login is successful with valid credentials
    Given user is login on page
    When user entered login and password
    And clicks on login button
    Then user is navigate to home page


#    Dzięki parametryzacji natomiast można stosowac rózne parametry testu
#  Scenario Outline: Check login is successful with valid credentials
#    Given user is login on page
#    When user entered <login> and <password>
#    And clicks on login button
#    Then user is navigate to home page
#    Examples:
#      |login               |password |
#      |micof86894@hax55.com|12345    |
#      |micof86894@hax.com  |1234     |
#      |micof86894@hax55.com|12345    |