package sampl1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPrac {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*
		 * driver.navigate().to("https://www.bahamabreeze.com");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		 * driver.findElement(By.xpath(
		 * "//button[@id='emailSignUpModal_overlayCloseButton']/img")).click();
		 */
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		JavascriptExecutor jexe= (JavascriptExecutor)driver;
		jexe.executeScript("javascript:window.scrollBy(250,500)");
		int framesize=driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=framesize; i++)
		{
			if(i==2) {
				driver.switchTo().frame(i);
			}
			
		}
	}
}
