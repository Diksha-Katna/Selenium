package SeleniumLearningSkills;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ShadowElement {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().window().maximize();
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#shadow-host";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#my-btn")).click();
		
	}

}