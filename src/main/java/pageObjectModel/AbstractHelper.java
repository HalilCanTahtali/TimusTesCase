package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public abstract class AbstractHelper
{
    private static WebDriver driver= Driver.getDriver();
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    JavascriptExecutor executor = (JavascriptExecutor)driver;


    public void clickElement(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    public void sendKeysElements(WebElement element,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys(text);
    }

    public void dropDownSelect(WebElement element, String value)
    {
        Select slct=new Select(element);

        slct.selectByVisibleText(value);
    }

    public void PrintAllElementOnList(List<WebElement> list)
    {
        for (WebElement a:list)
        {
            System.out.println(a.getText());
        }
        System.err.println("list size = " + list.size());
    }

    public void clickwithJS(WebElement element) throws InterruptedException {
        Thread.sleep(3000);
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
