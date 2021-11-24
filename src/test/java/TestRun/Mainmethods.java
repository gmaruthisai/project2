package TestRun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Mainmethods {
	
	WebDriver driver;
  @Given ("^To Launch my URL$")
  public void To_Launch_my_URL() throws Throwable 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
      // Write code here that turns the phrase above into concrete actions
  	driver.get("https://opensource-demo.orangehrmlive.com/");
  }																				 
  @Given ("^the Login details$")
  public void the_Login_details()throws Throwable
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
  }
  
  @And("^I have added the Nationalities$")
  
  public void I_have_added_the_Nationalities() throws Throwable
  {
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_nationality")).click();
	  findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("nationality_name")).sendKeys("admin123");
	  findElement(By.id("btnSave")).click();
  }
  
  @Then("^Logging out$")
  
  public void Logging_out()throws Throwable
  {
	  
	  driver.quit();
  }
  public   WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}  																					
  																							
  																							
}
