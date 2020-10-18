package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenThreeBrowserByUsingTestng {

	WebDriver driver;
	Long startTime;
	Long endTime;


	@BeforeSuite

	public void openBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
	}
	@Test
	public void openGamil() {
		driver.get("https://www.gamil.com");
	}
	@Test
	public void openbingo() {
		driver.get("https://www.bingo.com/");
	}
	@AfterSuite
	public void closeBrowser() {
		endTime=System.currentTimeMillis();
		Long totelTime=endTime-startTime;
		System.out.println("Totel Time is "+ totelTime);
	}


}
