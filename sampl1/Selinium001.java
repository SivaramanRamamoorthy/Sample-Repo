package sampl1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selinium001 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a")).getText());
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a")).click();
		WebElement we = driver.findElement(By.xpath("//*[@src= 'http://automationpractice.com/img/p/1/1-home_default.jpg']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",we );
		Actions action = new Actions(driver);
		//WebElement we = driver.findElement(By.xpath("//*[@src= 'http://automationpractice.com/img/p/1/1-home_default.jpg']"));
		action.moveToElement(we).build().perform();
		System.out.println("performed");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@data-id-product= '1']")).click();
		
		}
}
