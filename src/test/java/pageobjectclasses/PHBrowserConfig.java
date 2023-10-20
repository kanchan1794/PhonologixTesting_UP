package pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
//import java.net.malformedurlexception

public class PHBrowserConfig {

		
	  public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>();
	  static
      {
//          DesiredCapabilities OBJCapabalities =  new DesiredCapabilities();
//          OBJCapabalities.setBrowserName("chrome");
//          URL Url= null;

//          try
//          {
//              Url = new URL("http://65.0.11.42:4444/");
//          }
//          catch (MalformedURLException e)
//          {
//              throw new RuntimeException(e);
//          }

         // WebDriver driver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"), chromeOptions);




System.setProperty("webdriver.chrome.diver","/usr/bin/chrome-driver");
          ChromeOptions chromeOptions = new ChromeOptions();
          //chromeOptions.setBrowserVersion("118.0.5993.71 ");
          chromeOptions.setCapability("browserVersion", "118");
          WebDriver driver=null;
          //RemoteWebDriver driver = null;
          try {
              driver = new RemoteWebDriver(new URL("http://13.233.48.140/"),chromeOptions);//http://13.233.48.140/
          } catch (MalformedURLException e) {
              throw new RuntimeException(e);
          }
          driverThread.set(driver);
          driver.manage().window().maximize();
          System.out.println("########### I am here ###########");

//          WebDriver driver=new ChromeDriver();
//          driverThread.set(driver);
//          driver.manage().window().maximize();

		 /* System.setProperty("otel.traces.exporter", "jaeger");
		  System.setProperty("otel.exporter.jaeger.endpoint","http://localhost:4444");
		  System.setProperty("JAEGER_SERVICE_NAME", "client");
		  System.setProperty("otel.resource.attributes","service.name=selenium-java-try");

		  ImmutableCapabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
/*DesiredCapabilities OBJCapabalities = new DesiredCapabilities();
	  OBJCapabalities.setBrowserName("chrome");

	  @SuppressWarnings("deprecation")
	WebDriver driver = null;
	try {
		driver = new RemoteWebDriver(new URL ( "http://65.0.11.42:4444/"),OBJCapabalities);
	} catch (MalformedURLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  driverThread.set(driver);
	  driver.manage().window().maximize();
	  */

	  }
}


/*public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>();
//public WebDriver driver=new ChromeDriver();
//public static void SetDriver() {
static{
	WebDriver driver=new ChromeDriver();
	driverThread.set(driver);
	driver.manage().window().maximize();*/


