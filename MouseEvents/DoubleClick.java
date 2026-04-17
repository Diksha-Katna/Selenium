package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		box1.clear();
		box1.sendKeys("Diksha");
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();
		
		
		//Validate that box2 contains Diksha
		
		String box2data=box2.getAttribute("value");
		System.out.println(box2data);
		
		if(box2data.equals("Diksha"));
		{
			System.out.println("The text is same");
		}
		
		
		
		
		
		

	}

}
