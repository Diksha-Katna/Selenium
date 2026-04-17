package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement MainMenu=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement InsideMenu=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='Laptops']"));
		Thread.sleep(5000);
		act.moveToElement(MainMenu).moveToElement(InsideMenu).click().perform();
		
		
				
		
	}

}
