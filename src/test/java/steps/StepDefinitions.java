package steps;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utils.DriverFactory;

public class StepDefinitions
{
    String homePageActualTitle;
    String loginPageActualTitle;
    String registerPageActualTitle;
    String registerActualConfText;

    @Given("i navigate to nop commerce url")
    public void i_navigate_to_nop_commerce_url()
    {
        BasePage.driverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));

    }

    @Then("i should be on the home page")
    public void i_should_be_on_the_home_page()
    {
        homePageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("homePageExpectedTitle"),homePageActualTitle);
    }

    @When("i click on login link on the navbar")
    public void i_click_on_login_link_on_the_navbar()
    {
       BasePage.homePage.clickLoginLink();
    }

    @Then("i should be on the login page")
    public void i_should_be_on_the_login_page()
    {
        loginPageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("loginPageExpectedTitle"),loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
       BasePage.loginPage.enterEmail(email);

    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw)
    {
      BasePage.loginPage.enterPassword(pw);
    }

    @When("i click on login button")
    public void i_click_on_login_button()
    {
      BasePage.loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
      boolean verifyLogout =  BasePage.homePage.verifyLogout();
      Assertions.assertTrue(verifyLogout,"log out is displayed");
    }

    @When("i click on register link on the navbar")
    public void i_click_on_register_link_on_the_navbar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be on the register page")
    public void i_should_be_on_the_register_page()
    {

        registerPageActualTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("registerPageExpectedTitle"),registerPageActualTitle);
    }

    @When("i click on male radio button")
    public void i_click_on_male_radio_button()
    {
       BasePage.registerPage.clickMaleRadioBtn();
    }

    @When("i enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {
        BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
        BasePage.registerPage.enterLastName(dataTable.cell(1,1));
        BasePage.registerPage.enterEmail(dataTable.cell(1,2));
        BasePage.registerPage.enterPassword(dataTable.cell(1,3));
        BasePage.registerPage.enterConfPassword(dataTable.cell(1,4));
    }

    @When("i click on register button")
    public void i_click_on_register_button()
    {
       BasePage.registerPage.clickRegisterButton();
    }

    @Then("i should be registered successfully")
    public void i_should_be_registered_successfully()
    {
       registerActualConfText = BasePage.registerPage.getRegisterConfText();
       Assertions.assertEquals(DriverFactory.prop.getProperty("registerExpectedConfText"),registerActualConfText);
    }


    @Then("i should see the error messages for all mandatory fields")
    public void iShouldSeeTheErrorMessagesForAllMandatoryFields()
    {
        System.out.println("Verify error messages");
    }
}
