package sampl1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItPrac {
public static void main(String args[])
{
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
WebElement browse= driver.findElement(By.id("uploadfile"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", browse);
WebDriverWait wait= new WebDriverWait(driver,5);
WebElement clickaction =wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile"))));
clickaction.sendKeys("C://Users//sivaraman_r//Documents//Upload.xlsx");
clickaction.click();

}
}
