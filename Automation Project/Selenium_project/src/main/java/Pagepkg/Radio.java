package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio {
	WebDriver driver;
	String parent; 
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]")
	WebElement click;
	
	public Radio(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void newtab() {
		parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demoqa.com/radio-button");
	}
	
	public void radios() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		click.click();
		click.isSelected();
	}
	
}
