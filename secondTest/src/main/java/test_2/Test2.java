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
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("1234exyzabc@yahoo.com");
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='id_gender2' and @value='2']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Akanksha");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Balodi");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("Akanksha@123");
		Select sel1 = new Select(driver.findElement(By.id("days")));
		sel1.selectByValue("23");
		
		Thread.sleep(8000);
		Select sel = new Select(driver.findElement(By.id("months")));
		sel.selectByValue("10");
		
		Thread.sleep(5000);
		Select sel2 = new Select(driver.findElement(By.id("years")));
		sel2.selectByValue("1993");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Pentairscanapp");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("new thhipasandara");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bengaluru");
		Select sel3 = new Select(driver.findElement(By.id("id_state")));
		sel3.selectByValue("14");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("56007");
		
		Select sel4 = new Select(driver.findElement(By.id("id_country")));
		sel4.selectByValue("21");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("1234567890");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='My address']")).sendKeys("abcxyz");
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		Thread.sleep(5000);
		
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
		Thread.sleep(8000);
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
         driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='5']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		Thread.sleep(8000);
		assertEquals("47.38","47.38");
		driver.quit();
	
	}
}


	