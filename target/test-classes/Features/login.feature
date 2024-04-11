Feature: feature to test login functionality
Background:
Given Setup the entries in database
When launch the browser from config variables 
And hit the home page URL of banking site

	@SmokeTest
  Scenario: Admin login is successfully with valid credentials
  Given user is on login page
  When user login into application with "admin" and password "1234"
  And click on the login button
  Then user is navigated to home page
  Scenario: User login is successfully with valid credentials
  Given user is on login page
  When user login into application with "User" and password "123444"
  And click on the login button
  Then user is navigated to home page
  @SmokeTest @RegressionTest
  Scenario Outline: User login is successfully with valid credentials
    Given user is on login page
    When user login into application with "<Username>" and password "<Password>" combinations
    Then user is navigated to home page

    Examples: 
      | Username | Password    |
      | User123  | Password123 |
      | User456  | Password456 |
     
