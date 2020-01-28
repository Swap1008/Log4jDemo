package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test001 {

	Logger log=Logger.getLogger(Test001.class.getName());
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		log.info("Browser Launched");
		driver=new ChromeDriver();
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Configurations\\log4j.properties");
	}
	
	@Test
	public void tc001() {
		log.info("URL Launched");
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("flipkart");
		log.info("Search Text entered in search box");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Search Button Clicked");
		driver.close();
	}
}
