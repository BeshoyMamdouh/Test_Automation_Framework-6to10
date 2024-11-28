package Selenium_Web_Drive.Test_Automation_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testcase9 {
	
	WebDriver  driver= new ChromeDriver()  ;
	
	@BeforeTest
	  public void openBrowser() {	 
		driver.navigate().to("https://automationexercise.com/products") ; 
	  }
	 
  @Test
  public void verifiyAllproductPage() {
	  String  expectedResult = "Automation Exercise - All Products" ;
	  String  ActualResult = driver.getTitle() ;
	  Assert.assertEquals(expectedResult, ActualResult);
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
 
}
