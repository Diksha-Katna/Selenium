package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//By Name
		//WebElement Search=driver.findElement(By.name("q"));
		//Search.sendKeys("HTC");
		
		
		//By Tag Name and ID
		//WebElement Search=driver.findElement(By.cssSelector("input#small-searchterms"));
		//Search.sendKeys("HTC");
		
		
		//By Tag Name and Class Name
		//WebElement Search=driver.findElement(By.cssSelector("input.search-box-text"));
		//Search.sendKeys("HTC");
		
		//By Tag Name and Attribute
		//WebElement Search=driver.findElement(By.cssSelector("input[name='q']"));
		//Search.sendKeys("HTC");
		
		//By Tag Name, ClassName and Attribute
		WebElement Search=driver.findElement(By.cssSelector("input.search-box-text[name='q']"));
		Search.sendKeys("HTC");
		
		
		
		
		
		
		
	}

}
