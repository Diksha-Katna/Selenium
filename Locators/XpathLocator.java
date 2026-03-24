package SeleniumLearningSkills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Absolute xpath
		//WebElement search=driver.findElement(By.xpath("/html/body/div[6]/header/div[2]/div[2]/form/input"));
            //search.sendKeys("HTC");
		
		//Relative xpath 
		//WebElement search=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		//search.sendKeys("HTC");
		
		
		//Xpath with Single attribute 
		//WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		//search.sendKeys("HTC");   
		
		
		//xpath with multiple attribute
		//WebElement search=driver.findElement(By.xpath("//input[@name='q'][@id='small-searchterms']"));
		//search.sendKeys("HTC"); 
		
		//xpath with And Operator
		//WebElement search=driver.findElement(By.xpath("//input[@name='q' and @id='small-searchterms']"));
		//search.sendKeys("HTC"); 
		
		//xpath with Or Operator 
		//WebElement search=driver.findElement(By.xpath("//input[@name='q' or @id='ABC']"));
		//search.sendKeys("HTC"); 
		
		//xpath with inner text 
		//WebElement search=driver.findElement(By.xpath("//a[text()='Digital downloads']"));
		//String str=search.getText();
		//System.out.println(str);
		
		
		//xpath without anchor tag
		 //WebElement search=driver.findElement(By.xpath("//h2[text()='Welcome to our store']"));
		 //Boolean bl=search.isDisplayed();
		 //System.out.println(bl);
		
		
		
		//xpath with contains
		//WebElement search=driver.findElement(By.xpath("//input[contains (@id,'small-searchterms')]"));
		//search.sendKeys("HTC");
		
		//xpath with Starts with 
		
		//WebElement search=driver.findElement(By.xpath("//input[starts-with (@id,'small-searchterms')]"));
		//search.sendKeys("HTC");
		
		 
		//Chained xpath 
		
		WebElement search=driver.findElement(By.xpath("//form[@id='small-search-box-form']/input"));
		search.sendKeys("HTC");
				
		
				
	}

}
