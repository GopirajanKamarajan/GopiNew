package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regNewAcc {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://192.168.99.141:3000/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h4[text()='Register new account']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Gopirajan");
		driver.findElement(By.name("lastName")).sendKeys("Kamarajan");
		driver.findElement(By.name("email")).sendKeys("Gopirajank@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Soft@2020");
		driver.findElement(By.name("confirmPassword")).sendKeys("Soft@2020");
		driver.findElement(By.name("startDate")).sendKeys("19122024");
		driver.findElement(By.name("endDate")).sendKeys("19122025");
		driver.findElement(By.name("address")).sendKeys("Chennai");
		driver.findElement(By.name("phoneNumber")).sendKeys("9994276879");
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
		//if driver.findElement(By.xpath("//h2[text()='Registration successful!']"))
		//driver.findElement(By.xpath("//button[text()='Navigate to login Page']")).click();
		//if driver.findElement(By.xpath("//h2[text()='Registration successful!']")).isDisplayed()
		
	}

}
