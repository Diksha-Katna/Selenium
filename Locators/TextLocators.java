package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//WebElement text1=driver.findElement(By.linkText("Digital downloads"));
		//text1.click();
		driver.findElement(By.partialLinkText("Boo")).click();	
		System.out.println("Hey! You located it ");
	}

}
