package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alert {
	WebDriver driver;
	String parent;
	
	@FindBy(xpath="//*[@id=\"OKTab\"]/button")
	WebElement click;
	
	public alert(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void newtab() {
		parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");	
	}
	
	public void alerts() {
		click.click();
		driver.switchTo().alert().accept();
	}
	
}
