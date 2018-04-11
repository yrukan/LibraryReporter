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

public class TestExample {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\students\\yuliya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.switchTo().frame(index);

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		/*driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));*/
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		ExpectedCondition condition = ExpectedConditions.alertIsPresent();
		WebElement element1 = wait.until(condition);		
		
		ExpectedCondition conditionClickable = ExpectedConditions.elementToBeClickable(By.id("el1"));
		WebElement element2 = wait.until(condition);
		
		/*WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));*/
		
		TATHTP/Klopik123
		
		

	}
}
