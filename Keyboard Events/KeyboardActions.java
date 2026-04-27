package SeleniumLearningSkills;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement box1=driver.findElement(By.xpath("//textarea[@name='text1']"));
		box1.sendKeys("Hello Diksha Katna");
		
		//Selecting the text using control A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Copy the text using control C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		
	    //Use TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
	}

}
