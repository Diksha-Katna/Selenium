package pageObjects;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(xpath="//a[contains(text(),'Login')]")
WebElement linkLogin;

public void clickMyAccount()
{
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].click();", lnkMyaccount);
}

public void clickRegister()
{
	lnkRegister.click();
}
public void clickLogin()
{
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].click();", linkLogin);
}
}
