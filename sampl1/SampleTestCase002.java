package sampl1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestCase002 {
	public WebDriver driver;
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(dataProvider="testdata")
	
	public void testingcase002(String username, String password) throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		WebDriverWait Wait = new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a")).click();
		WebElement we = driver.findElement(By.xpath("//*[@src= 'http://automationpractice.com/img/p/1/1-home_default.jpg']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",we );
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		System.out.println("performed");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		driver.findElement(By.xpath("//div[@class='header_user_info']/a/span")).click();
		driver.findElement(By.xpath("//li[@class='lnk_wishlist']/a/span")).click();
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		driver.findElement(By.xpath("//a[@class='logout']")).click();

	}
	@DataProvider(name ="testdata")

	public static Object[][]testdata(){
		Object [][] obj = new Object[2][2];
		obj[0][0]="sivaraman.ramamoorthy@photoninfotech.net";
		obj[0][1]="Test@123";
		obj[1][0]="vrshiv09@gmail.com";
		obj[1][1]="Test@246";
		return obj;

	}
}
