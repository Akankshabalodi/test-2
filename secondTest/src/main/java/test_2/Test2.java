package test_2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public static void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Web Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
	    driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("admin@xyz.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//i[@class='icon-home']")).click();
		Actions action= new Actions(driver);
		WebElement mouse_mv = driver.findElement(By.xpath("//a[@title='Women']"));
		
		action.moveToElement(mouse_mv).perform();
         Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']")).click();
		WebElement productSort = driver.findElement(By.id("selectProductSort"));	
		Select list = new Select(productSort);
		list.selectByVisibleText("Price: Lowest first");
		Thread.sleep(6000);
		WebElement MV = driver.findElement(By.xpath("(//a[@title='Printed Chiffon Dress'])[2]"));
		
		action.moveToElement(MV).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='7']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		Thread.sleep(6000);
		WebElement mouse_mv2 = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[2]"));
		Actions action1= new Actions(driver);
		action1.moveToElement(mouse_mv2).perform();
         Thread.sleep(8000);
         driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='6']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		assertEquals("48.90", "48.90");
		driver.quit();
		
	}
}


	