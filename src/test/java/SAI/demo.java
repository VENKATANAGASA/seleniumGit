package SAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	@Test
	public void login_Test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("9490073694");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		password.sendKeys("Sai@9364");
		WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		login.click();
		driver.close();
		
		}
	}
