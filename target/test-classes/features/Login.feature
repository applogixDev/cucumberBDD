Feature: Login to nop commerce

   @ui
 Scenario: Verify login with valid credentials
   Given i navigate to nop commerce url
   Then  i should be on the home page
   When  i click on login link on the navbar
   Then  i should be on the login page
   When  i enter email as "userqa1@nop.com"
   And   i enter password as "Testing@5"
   And   i click on login button
   Then  i should be logged in successfully


