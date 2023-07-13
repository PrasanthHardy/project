package Maven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class browser1 {
	WebDriver driver;
	
	
@BeforeSuite
private void setup() {
 
	System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@Test	
private void searchbox() throws InterruptedException {
	driver.get("https://www.amazon.in/");

	WebElement sendKeys=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    sendKeys.sendKeys("iphone"); 
    Thread.sleep(2000);
   
WebElement click= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
click.click();
	
	}	
@Test
private void login() {
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	WebElement send= driver.findElement(By.xpath("//input[@id='ap_email']"));
send.sendKeys("9962482400");
WebElement con= driver.findElement(By.xpath("continue"));
con.click();
}


@AfterSuite
private void tierdown() {
//driver.close();
driver.quit();

}
			 

}