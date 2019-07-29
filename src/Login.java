import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Login {

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Bharathi\\eclipse-workspace\\IRCTC\\driver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.irctc.co.in/nget/train-search");
	}
	
     @BeforeMethod
     public static void beforeMethod() {
	
    	 Date d=new Date();
    	 System.out.println(d);
    	 
       }
     
     @Test
     public void test1() {
    	 
    	 driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted")).sendKeys("chennai");
    	 driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted")).sendKeys("madurai");
    	 
     }
     
     
     @AfterMethod
     public static void afterMethod() {
    	 Date d=new Date();
    	 System.out.println(d);
    	 
       }
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	
	
}
