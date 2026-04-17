package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, destination).perform();
		
		
		
		
	}

}
