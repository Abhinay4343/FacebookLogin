package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	public void test() {
		System.out.println("test");
		driver.get("https://www.google.co.in/");
	     driver.manage().window().maximize();
	     driver.navigate().to("http://www.fb.com");
	     WebElement create=driver.findElement(By.linkText("Create New Account")); create.click();
//	     create.click();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement Fname=driver.findElement(By.name("firstname"));
	    WebElement surname=driver.findElement(By.name("lastname"));
	    WebElement email=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
	    WebElement reg_enteremail=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
	    WebElement newpassword=driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
	    Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
//		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
//		driver.findElement(By.name("websubmit")).click();
	     Fname.clear();
	     Fname.sendKeys("Abhi");
	     surname.clear();
	     surname.sendKeys("Kanukuntla");
	     email.sendKeys("abhinay.kanukuntla@gmail.com");
	     reg_enteremail.sendKeys("abhinay.kanukuntla@gmail.com");
	     newpassword.sendKeys("sunny@5545");
	     selDate.selectByVisibleText("30");
	     selMonth.selectByVisibleText("Dec");
	     selYear.selectByVisibleText("1998");
	     driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			driver.findElement(By.name("websubmit")).click();
	}

}