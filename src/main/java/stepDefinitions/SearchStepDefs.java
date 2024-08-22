package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.SearchPage;
import utilities.Driver;

public class SearchStepDefs
{
    private WebDriver driver;
    SearchPage sp=new SearchPage();
    @Given("User go to amazon website")
    public void user_go_to_amazon_website()
    {
        driver= Driver.getDriver();
        driver.get("https://www.amazon.com.tr");
    }
    @When("User accept the cookies")
    public void user_accept_the_cookies()
    {
        sp.clickCookies();
    }
    @When("user click the all button")
    public void user_click_the_all_button()
    {
        sp.clickAllButton();
    }
    @When("user click the computer button")
    public void user_click_the_computer_button()
    {
        sp.clickComputerButton();
    }
    @When("user click the notebooks button")
    public void user_click_the_notebooks_button() throws InterruptedException {
        sp.clickNotebook();
    }
    @When("user click win11 home and win11 pro checkbox")
    public void user_click_win11_home_and_win11_pro_checkbox() throws InterruptedException {
        sp.clickWin11HomeButton();
        sp.clickWin11ProButton();
    }
    @Then("print the all prices at the current page")
    public void print_the_all_prices_at_the_current_page()
    {
        sp.PrintAllPrices();
        //Driver.closeDriver();
    }
}
