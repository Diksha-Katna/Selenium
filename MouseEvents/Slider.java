package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement minslider=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		Point pt=minslider.getLocation();
		System.out.println("The x and y coordinates are:" +pt); //The x and y coordinates are:(59, 250)
		act.dragAndDropBy(minslider, 100, 250).perform();
		
		
		//selecting max slider
	    WebElement maxslider=driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		Point ptr=maxslider.getLocation();
		System.out.println("The x and y coordinates are:" +ptr);  //The x and y coordinates are:(613, 250)
		act.dragAndDropBy(maxslider, -100, 250).perform();
		

	}

}
