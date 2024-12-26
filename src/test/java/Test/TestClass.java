package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://192.168.99.141:3000/");
		driver.findElement(By.name("username")).sendKeys("gopirajan.kamarajan@expleogroup.com");
		driver.findElement(By.name("Password")).sendKeys("Soft@2024"); 
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.close();

	}

}
