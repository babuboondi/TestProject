package frontautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testprogram {
 static WebDriver browser;
 @BeforeClass
 public void setup() throws InterruptedException
 {
	 //WebDriverManager.chromedriver().setup();
	 ChromeOptions cap = new ChromeOptions();
     cap.setBrowserVersion("116");
     cap.addArguments("--remote-allow-origins=*");

     browser = new ChromeDriver(cap);
     //browser = new ChromeDriver();
     browser.get("https://demoqa.com/text-box");
     browser.manage().window().maximize();
     Thread.sleep(2000);
     browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
 }
 @Test
 public void openwindow()
 {
		/*
		 * WebElement text=
		 * browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 * text.sendKeys("iphone"); text.sendKeys(Keys.RETURN);
		 */
	 System.out.println("run tests");
 }
 
 @AfterClass
 public void tearDown() {
	 if(browser!=null) {
	   browser.quit();
	 }
		 
 }
}
