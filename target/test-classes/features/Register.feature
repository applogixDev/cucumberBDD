Feature: Register user


Background: navigate to url and goto register page
  Given i navigate to nop commerce url
  Then  i should be on the home page
  When  i click on register link on the navbar
  Then  i should be on the register page

@register
Scenario: Verify user registration by providing data in all mandatory fields

  When  i click on male radio button
  And   i enter firstName lastName email password confirmPassword
    | firstName | lastName | email         | password | confirmPassword |
    | user      | qa       | user1@nop.com | Testing  | Testing         |

  And    i click on register button
  Then   i should be registered successfully


  @register
  Scenario: Verify error messages when user registers by not providing data in all mandatory fields
    When   i click on register button
    Then   i should see the error messages for all mandatory fields



