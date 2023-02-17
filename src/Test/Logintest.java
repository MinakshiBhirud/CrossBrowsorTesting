package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Helper.BrowserOperations;

public class Logintest
{
	@Test
	@Parameters("browser")
	public void LogintestMethod(String browsername) throws IOException
	{
		
		BrowserOperations browseroperationobj = new BrowserOperations();
		WebDriver driver =browseroperationobj.LaunchApplication(browsername);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
}
