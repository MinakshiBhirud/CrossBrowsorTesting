package Helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserOperations

{
	WebDriver driver;
	String title;
	
	
		
		
	public WebDriver LaunchApplication(String browsername) throws IOException
	{
		
		
		switch(browsername)
		{
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium Data\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
					
					
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium Data\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
						
			
			  break;
			  
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		break;
		
		default:
			System.out.println("Browse not found");
			break;
		}
		//FileOperation fileoperationsobj = new FileOperation();
		//String url = fileoperationsobj.ReadPropery("url");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		return driver;
	}


}
