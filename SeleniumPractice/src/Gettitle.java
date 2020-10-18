import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Gettitle {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com");	
		driver.close();


	}

}
