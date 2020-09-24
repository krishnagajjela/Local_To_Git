Feature: Login
        As a user I should able to login into my app
 
Scenario Outline: Login fail - possible combinations
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets login failed error message

    Examples: 
      | UserName      | Password      |
      | wrongusername | 123456        |
      | ShankarGarg   | wrongpassword |
      | wrongusername | wrongpassword |
      
Scenario: Existing user Verification 
Given user is on Application landing page
    Then we verify following user exists
      | name    | email           | phone |
      | Shankar | sgarg@email.com | 999   |
      | Ram     | ram@email.com   | 888   |
      | Sham    | sham@email.org  | 666   |