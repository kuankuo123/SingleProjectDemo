package tests;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("https://www.baidu.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    System.setProperty("webdriver.ie.driver","E:\\Downloads\\IEDriverServer_x64_2.43.0\\IEDriverServer.exe");
	    DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
	    ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	    
	    ieCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
	    
	    
	    driver = new InternetExplorerDriver(ieCapabilities);	  
	  
	  
	  
	  
	  //System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
	  //driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}