package sampl1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClassPrac {
	public static void main(String args[]) throws IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.indeed.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Upload Your Resume')]")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//label[contains(text(),'Upload Resume')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		StringSelection sel= new StringSelection("C:\\Users\\sivaraman_r\\Documents\\Upload.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
}
