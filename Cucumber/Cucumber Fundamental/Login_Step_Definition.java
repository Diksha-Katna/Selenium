package Step_Definition;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Step_Definition {
	WebDriver driver;
	@Given("The user is on the nopCommerce login page")
	public void navigateToLoginPage() {
	  
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		System.out.println("Step executed");
	}
	
	@When("The user enter valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String user, String pwd) {
	
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		System.out.println("Step executed");
		
	}


	@When("The user clicks on Login Button")
	public void the_user_clicks_on_the_login_button() {
	   
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		System.out.println("Step executed");
	}

	@Then("The user should be redirected to myaccount page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	   boolean status=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	   Assert.assertEquals(status,true);
	   System.out.println("Step executed");
	   driver.quit();
	}


	  
	

	

}
