package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.LoginPage;
import utilities.Driver;

public class LoginStepDefs
{
    LoginPage lp = new LoginPage();
    private WebDriver driver;

    @Given("user go to amazon website")
    public void user_go_to_amazon_website()
    {
        driver = Driver.getDriver();
        driver.get("https://www.amazon.com.tr/");
    }

    @When("User click hello button")
    public void user_click_hello_button()
    {
        lp.clickHelloButton();
    }

    @When("user type the {string} phone")
    public void user_type_the_phone(String phone)
    {
        lp.typeMail(phone);
    }

    @When("user click the next button for phone")
    public void user_click_the_next_button_for_phone()
    {
        lp.clickMailButton();
        // Mail hatası varsa kontrol et
        lp.isPhoneAlertMessageDisplayed();
    }

    @When("user type the {string} password")
    public void user_type_the_password(String pass)
    {
        lp.typePass(pass);
    }

    @Then("user click the next button for pass")
    public void user_click_the_next_button_for_pass()
    {
        lp.clickPassButton();
        // Şifre hatası varsa kontrol et
        lp.isPassAlertMessageDisplayed();

        Driver.closeDriver();
    }
}