Feature: Register Flow Test Suite

  Scenario: Register Page can be accessed from the Home Page
    Given Home Page is Displayed
   When registerLink from Header menu is cliked
    Then the current url contains "route=account/register" keyword

  Scenario:The Account Page Url is opened when the registration is successful
    Given "host/index.php?route=account/register&language=en-gb" endpoint is accessed
    When the register form is populated with valid random data
    And Continue button is cliked
    Then the current url contains "route=account/success" keyword

    Scenario: User remains on registerPage when the continue button is not clicked
      Given "/" endpoint is accessed
      When the register form is populated with valid random data
      Then the current url contains "route=account/register" keyword