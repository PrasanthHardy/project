package Maven.TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test_One {
	WebDriver driver;
	
	 @Test(invocationCount = 10)
 	 public void sample() {
 		 System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
 		 driver = new ChromeDriver();
 		 driver.get("https:// /java/");
 		 driver.manage().window().maximize();
 		 
		
	}
	 @Test(priority = 1)
	public void  sample1 () {
		 
		 System.out.println("asdfghjkl");
		 
		
	}
	 @Test(priority = 2)
	 public void sample3 () {
		 
		 
		System.out.println("oiyuiuhy");
	}
	 @AfterSuite
	 public void ample4() {
	 
		driver.quit();
	}
	 
	 
}
