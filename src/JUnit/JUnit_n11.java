package JUnit;


import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class JUnit_n11 extends TestCase {
	private static FirefoxDriver driver;
	WebElement element;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("http://www.n11.com"); //driver goes to web address
		assertEquals("n11.com", driver.getTitle()); //use to assert
	}
	
	@Test
	public void test(){
		
		WebElement link; //create a WebElement named link 
		link = driver.findElement(By.linkText("Giriþ Yap")); //button assign to link
		link.click(); // Click to assigned button
		driver.findElement(By.id("email")).sendKeys("brctanrikut@hotmail.com");
		WebElement burcu;
		burcu = driver.findElement(By.id("password"));
		burcu.sendKeys("SELEdene2015");
		burcu.submit();
		try{
			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchData"));
			searchBox.click();
			driver.findElement(By.id("searchData")).sendKeys("samsung");
			WebElement css;
			css= driver.findElement(By.cssSelector("a.searchBtn"));
			css.click();
			//Thread.sleep(5000);
			WebElement link2;
			link2= driver.findElement(By.linkText("2"));
			link2.click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='p-28107268']/div[2]/span[2]")).click(); //Found xPath from Firebug and FirePath
			//Thread.sleep(5000);
			WebElement link3;
			link3= driver.findElement(By.linkText("Hesabým"));
			link3.click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='myNavigation']/li[3]/a")).click();
			//Thread.sleep(5000);
			WebElement kaldir;
			kaldir= driver.findElement(By.linkText("Kaldýr"));
			kaldir.click();
			//Thread.sleep(5000);
			}catch(NullPointerException e){
				driver.quit();
				}
		Assert.assertNotNull(burcu);
		System.out.println("Ending test" + new Object(){}.getClass().getEnclosingMethod().getName());
		}
	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
        driver.quit();
    }
	
        
	
	

}