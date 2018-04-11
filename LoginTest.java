package by.htp.library.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
  @BeforeTest
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver",
				"D:\\students\\yuliya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		
		WebElement title = driver.findElement(By.id("PH_user-email"));		
		String account = title.getText();	
		Thread.sleep(2000);	
		driver.close();
		
		System.out.println("Your account name is: " + account);
		
		Assert.assertEquals(account, "tathtp@mail.ru", "Account name is not correct");
  }
  
 
}
