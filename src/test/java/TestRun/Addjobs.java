package TestRun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Addjobs {
	WebDriver driver;
	 
	@Given ("^To launch my orangeHRM websit$")
	
	public void To_launch_my_orangeHRM_websit() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Given ("^My login detail$")
	public void My_login_detail(DataTable LoginData) throws Throwable
	{
		List<List<String>> data = LoginData.raw();
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Then ("^I created Addjobs Record$")
	
	public void I_created_Addjobs_Record(DataTable JobsData) throws Throwable
	
	{
		List<List<String>> data = JobsData.raw();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("jobTitle_note")).sendKeys(data.get(0).get(2));
		driver.findElement(By.id("btnSave")).click();
		
	}
	/*@Then ("^I have added the Jobs Record2$")
	public void I_have_added_the_Jobs_Record2(String  JobsRecord2) throws Throwable
	{
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(JobsRecord2);
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(JobsRecord2);
		driver.findElement(By.id("jobTitle_note")).sendKeys(JobsRecord2);
		driver.findElement(By.id("btnSave")).click();
		
	}*/
	/*@Then ("^I have added the Jobs Record3$")
	
	public void I_have_added_the_Jobs_Record3(String  JobsRecord3) throws Throwable
	{
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(JobsRecord3);
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(JobsRecord3);
		driver.findElement(By.id("jobTitle_note")).sendKeys(JobsRecord3);
		driver.findElement(By.id("btnSave")).click();
		
	}*/

	
	@Then ("^i have done logou$")
	public void i_have_done_logou() throws Throwable
	{
		driver.quit();
	}

}
