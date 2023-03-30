package com.platform.stg.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;

	/*
	 * @BeforeMethod public void setup() { driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //
	 * Navigate Browser URL driver.get("https://katalon-demo-cura.herokuapp.com/");
	 * // Get the title and verify 'Application Title' String Actualtitle =
	 * driver.getTitle(); System.out.println(Actualtitle); String ExpectedTitle =
	 * "CURA Healthcare Service"; Assert.assertEquals(ExpectedTitle, Actualtitle); }
	 */

	  @BeforeTest 
	  public void setup() { 
		  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //Navigate Browser URL 
	  driver.get("https://katalon-demo-cura.herokuapp.com/");
	  // Get the title and verify 'Application Title' 
	  String Actualtitle = driver.getTitle(); 
	  System.out.println(Actualtitle); 
	  String ExpectedTitle ="CURA Healthcare Service"; Assert.assertEquals(ExpectedTitle, Actualtitle); }
	 
	@Test(priority = 1)
	public void testBookAppointmentOne() {
		
		// Navigate Login Menu toggle
		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

		// Enter Email and Password - Using xpath locators
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		// Click Submit button
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();

		// Make an Appointment
		driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
		driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
		driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("03/28/2023");
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Automation Testing");
		// Click Book Appointment button
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
	}

	@Test(priority = 2)
	public void testBookAppointmentTwo() {
		// Click Homepage
		driver.findElement(By.xpath("//a[normalize-space()='Go to Homepage']")).click();
		
		// Make an Appointment
		driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
		driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
		driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("03/28/2023");
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Automation Testing");
		// Click Book Appointment button
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

	}
	
	@Test(priority = 3)
	public void testBookAppointmentThree() {
		// Click Homepage
		driver.findElement(By.xpath("//a[normalize-space()='Go to Homepage']")).click();
		
		// Make an Appointment
		driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
		driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
		driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
		driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("03/28/2023");
		driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("QA Automation Testing");
		// Click Book Appointment button
		driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

	}

	
	@AfterTest 
	public void tearDown() { 
		driver.quit(); }
	 

}



















/*
 * // Add Goal Setter driver.findElement(By.xpath("//input[@id='text']")).
 * sendKeys("Goal Automation1");
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * // Java OOP - Encapsulation - Inheritance
 * 
 * 
 * //Enter Email and Password - Using css Selector locators
 * driver.findElement(By.cssSelector("input[id='email']")).sendKeys("");
 * driver.findElement(By.cssSelector("input[id='password']")).sendKeys("");
 * driver.findElement(By.xpath("button[type='submit']")).click();
 */

// driver.close();

// driver.manage().window().maximize();
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Navigate Browser URL
// driver.get("http://localhost:3000/login");

// Get the title and verify 'Goal setter App'
// String Actualtitle = driver.getTitle();
// String ExpectedTitle = "Goalsetter App";
// Assert.assertEquals(ExpectedTitle, Actualtitle);

// Enter Email and Password
// driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("testqa@mail.com");
// driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("1234");

// Click Submit button
// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

// Add Goal Setter
// driver.findElement(By.xpath("//input[@id=\"text\"]")).sendKeys("Goal
// Automation5");
// driver.findElement(By.xpath("//button[normalize-space()=\"Add
// Goal\"]")).click();

// Verify Goal label text that has been added - Locating the element
// WebElement TextElement =
// driver.findElement(By.xpath("//h2[normalize-space()=\"Goal Automation5\"]"));
// String ActualText = TextElement.getText();

// using getText method the retrieve the text of the element
// String ExpectedText = "Goal Automation5";
// System.out.println(ActualText);

// Assert to verify the actual and expected values
// Assert.assertEquals(ActualText, ExpectedText);
