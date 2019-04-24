package sampl1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestCase001 {
	public WebDriver driver;

	@BeforeMethod
	public  void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void testmethod() throws InterruptedException {

		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a")).click();
		WebElement we = driver.findElement(By.xpath("//*[@src= 'http://automationpractice.com/img/p/1/1-home_default.jpg']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",we );
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		System.out.println("performed");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-id-product= '1']")).click();	
	}
	@AfterMethod
	public void closingmethod() {
		driver.quit();
		
	}
}
