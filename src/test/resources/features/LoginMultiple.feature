Feature: Login to nop commerce

  @ui
 Scenario Outline: Verify login with valid credentials
   Given i navigate to nop commerce url
   Then  i should be on the home page
   When  i click on login link on the navbar
   Then  i should be on the login page
   When  i enter email as "<email>"
   And   i enter password as "<password>"
   And   i click on login button
   Then  i should be logged in successfully

   Examples:

     | email           | password  |
     | userqa1@nop.com | Testing@5 |
     | userqa2@nop.com | Testing@5 |
     | userqa3@nop.com | Testing@5 |
