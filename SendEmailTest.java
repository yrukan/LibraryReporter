package by.htp.library.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SendEmailTest {

	private WebDriver driver;

	@Test
	public void f() {
		

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\students\\yuliya\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://mail.ru/");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("mailbox:login"));
		login.sendKeys("TATHTP");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("mailbox:password"));
		password.sendKeys("Klopik123");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='mailbox:submit']/input"));		
		submit.click();		
		Thread.sleep(2000);
		
		/*driver.get("https://e.mail.ru/messages/inbox/?back=1");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("PH_user-email"))); */
		
		WebElement writeLetter = driver.findElement(By.xpath("//*[@id='b-toolbar__left']/div/div/div[2]/div/a"));		
		writeLetter.click();		
		Thread.sleep(2000);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		
		
		
		
		
		WebElement email = driver.findElement(By.xpath("//textarea[@data-original-name='To']"));		
		email.sendKeys("TATHTP@mail.ru");
		Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.xpath("//input[@name='Subject']"));
		subject.sendKeys("Test Mail from Yuliya");
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.id("toolkit-152347014980041composeFrame"));
		text.sendKeys("Test text from Yuliya");
		Thread.sleep(2000);
		
		WebElement send = driver.findElement(By.xpath("toolkit-152347014980041composeFrame"));
		send.click();
		Thread.sleep(2000);
		
		

	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
