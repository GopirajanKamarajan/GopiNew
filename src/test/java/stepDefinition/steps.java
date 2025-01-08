package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class steps {
	WebDriver driver = new ChromeDriver();

	@Given("User should be in login page")
	public void user_should_be_in_login_page() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.99.141:3000/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("gopirajan.kamarajan@expleogroup.com");
		driver.findElement(By.name("Password")).sendKeys("Soft@2024"); 
	}

	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@Then("User should enters the login page")
	public void user_should_enters_the_login_page() {

		WebElement logout_btn = driver.findElement(By.xpath("//button[text()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
		System.out.println("Login Successful");

		// driver.findElement(By.xpath("//button[text()='Logout']")).click();
		driver.quit();
	}

}
