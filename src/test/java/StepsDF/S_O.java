package StepsDF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S_O {
	WebDriver driver;
	@Given("open the browser, enter the sparsh hospital url")
	public void open_the_browser_enter_the_sparsh_hospital_url() {
		
		driver = new ChromeDriver();
		driver.get("https://www.sparshhospital.com/");
	    
	}

	@Given("select yashwanthpur hospital from the hospital dropdown")
	public void select_yashwanthpur_hospital_from_the_hospital_dropdown() {
		driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]")).click();
		driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/hospitals/sparsh-hospital-yeswanthpur/'])[1]")).click();	  
	}

	@When("users clicks the second opinion link")
	public void users_clicks_the_second_opinion_link() {
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("arguments[0].click()", driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/second-opinion/'])[1]")));

	   
	}

	@When("user enters the firstname,lastname,phonno, email")
	public void user_enters_the_firstname_lastname_phonno_email() {
		
		driver.findElement(By.id("secondopinion_first_name")).sendKeys("itachi");
		
		driver.findElement(By.id("secondopinion_last_name")).sendKeys("uchiha");
		
		driver.findElement(By.id("secondopinion_phone")).sendKeys("9021772648");
		
		driver.findElement(By.id("secondopinion_email")).sendKeys("addi@gmail.com");
		
	 
	}

	@When("upload the report and enter a message and clicks the send button")
	public void upload_the_report_and_enter_a_message_and_clicks_the_send_button() {
		
		driver.findElement(By.id("secondopinion_reports")).sendKeys("C:\\Users\\salun\\Downloads\\Project logo.jpeg");
		
		driver.findElement(By.id("secondopinion_message")).sendKeys("I am well");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click()", driver.findElement(By.id("secondopinion_submit")));

	
	   
	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {
	    
		String Text = driver.findElement(By.xpath("//h1[@class='font-700 mb-4']")).getText();
		String textExpectedString = "Thank you";
		org.testng.Assert.assertEquals(Text, textExpectedString);

	}

	@Then("bank info should be available in the page")
	public void bank_info_should_be_available_in_the_page() {
		String Bankname = driver.findElement(By.xpath("(//div[@class='col-md-12 p-4'])[2]/p[3]")).getText();
		String BanknameExpected = "Bank Name: Bank of Baroda";
		org.testng.Assert.assertEquals(Bankname, BanknameExpected);
		driver.close();
		
	}
}
