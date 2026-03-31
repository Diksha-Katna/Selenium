package SeleniumLearningSkills;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandle {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);		
		WebElement Textbox=driver.findElement(By.xpath("//input[@name='mytext1']"));
		Textbox.sendKeys("Welcome");		
		driver.switchTo().defaultContent();
		
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement Textbox2=driver.findElement(By.xpath("//input[@name='mytext2']"));
		Textbox2.sendKeys("Hello");
		driver.switchTo().defaultContent();
		
		

		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement Textbox3=driver.findElement(By.xpath("//input[@name='mytext3']"));
		Textbox3.sendKeys("Hello Testers");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@frameborder='0']"));
		driver.switchTo().frame(iframe);
	    WebElement Radio1=driver.findElement(By.xpath("//div[@role='radio' and @aria-setsize='3' and @aria-posinset='2']"));
	    Radio1.click();
	    
		
		List<WebElement>Checkboxes=driver.findElements(By.xpath("//div[@role='checkbox']"));
		int totalcheckboxes= Checkboxes.size();
		System.out.println("The total checkboxes are: " +totalcheckboxes);
		
		
		for(int i=0;i<totalcheckboxes;i++)
		{
			Checkboxes.get(i).click();		
					
		}		 
	
		
	}

}
