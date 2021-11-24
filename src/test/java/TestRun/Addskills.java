package TestRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Addskills {
	
	WebDriver driver;
 
	@Given ("^To launch my orangeHRM website$")
	
	public void To_launch_my_orangeHRM_website() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Given ("^My login details$")
	public void My_login_details() throws Throwable
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Then ("^i have given skills record$")
	
	public void i_have_given_skills_record() throws Throwable
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();		
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("skill_name")).sendKeys("admin123");
		driver.findElement(By.id("skill_description")).sendKeys("admin12334");
		driver.findElement(By.id("btnSave")).click();
		
	}
	
	@And ("^i have done logout$")
	public void i_have_done_logout() throws Throwable
	{
		driver.quit();
	}
	
	
	}
	

	
	
	
	    
	    
	    