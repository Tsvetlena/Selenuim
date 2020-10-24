package MyGroup.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	
	WebDriver driver = null;
	
	

	 {
		
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://finance.yahoo.com/");
		
		WebElement accept = driver.findElement(By.name("agree"));
		accept.click();
		
		WebElement signinBut = driver.findElement(By.id("header-signin-link"));
		signinBut.click();
		
		
		
		driver.close();
		
		
	}

}
