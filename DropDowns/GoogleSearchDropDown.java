package SeleniumLearningSkills;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("Peace");
		Thread.sleep(5000);
		List<WebElement>mylist=driver.findElements(By.xpath("//ul[@jsname='bw4e9b'] [@role='listbox']/li/div"));
		int total=mylist.size();
		System.out.println("Total Number Of Suggestion:" +total);
		
		
		
		
	}

}
