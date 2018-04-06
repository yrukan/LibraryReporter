package by.htp.library.example;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SimpleTest {

	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\students\\yuliya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.quizful.net/LoginAction.registration");
		Thread.sleep(2000);
		
		WebElement form = driver.findElement(By.xpath("//*[@id='register-form']/div[3]/form"));

		WebElement login = driver.findElement(By.id("login"));
		login.sendKeys("seleniumTest_2");
		Thread.sleep(50);

		WebElement password = driver.findElement(By
				.name("registrationForm.password"));
		password.sendKeys("seleniumTest_2");
		Thread.sleep(50);

		WebElement repassword = driver.findElement(By
				.name("registrationForm.repassword"));
		repassword.sendKeys("seleniumTest_2");
		Thread.sleep(50);

		WebElement email = driver
				.findElement(By.name("registrationForm.email"));
		email.sendKeys("test@ad.min");

		Thread.sleep(50);

		WebElement corp = driver.findElement(By.id("corporate"));
		corp.click();
		Thread.sleep(1000);

		for (int i = 0; i < 100000000; i++) {
			WebDriverWait wait = new WebDriverWait(driver, 999999999);
			WebDriverWait wait1 = new WebDriverWait(driver, 900000000);
			WebDriverWait wait2 = new WebDriverWait(driver, 900000000);
		}

		WebElement submit = driver.findElement(By
				.xpath("//*[@id='register-form']/div[3]/form/p[2]/input[1]"));		
		submit.click();	
		
		Thread.sleep(10000000);

		Thread.sleep(50);
		driver.close();

	}

}
