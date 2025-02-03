package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeTest
	public void open_webpage() throws Exception {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.carwale.com/");
		driver.manage().window().maximize();
	}
}
