package Selenium_Web_Drive.Test_Automation_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testcase8 {
	
	WebDriver  driver= new ChromeDriver()  ;
	
	@BeforeTest
	  public void openBrowser() {	 
		driver.navigate().to("https://automationexercise.com/products?search=") ; 
	  }
	 
  @Test
  public void  verifySearchproduct() {
	  String  expectedResult = "Automation Exercise - All Products" ;
	  String  ActualResult = driver.getTitle() ;
	  Assert.assertEquals(expectedResult, ActualResult);
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
 
}
