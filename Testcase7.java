package Selenium_Web_Drive.Test_Automation_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testcase7 {
	
	WebDriver  driver= new ChromeDriver()  ;
	
	@BeforeTest
	  public void openBrowser() {	 
		driver.navigate().to("https://automationexercise.com/test_cases") ; 
	  }
	 
  @Test
  public void verifiyTestcasesPage() {
	  String  expectedResult = "Automation Practice Website for UI Testing - Test Cases" ;
	  String  ActualResult = driver.getTitle() ;
	  Assert.assertEquals(expectedResult, ActualResult);
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
 
}
