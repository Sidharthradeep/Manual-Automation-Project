package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class windowhandle {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[3]/div/div/div[1]/div/div/div/a")
	WebElement link;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[1]/div[1]/div/fieldset/legend/span")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"lead-submit\"]")
	WebElement submit;
	
	public windowhandle(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void openlink()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		String parent=driver.getWindowHandle();
		link.click();
		driver.switchTo().window(parent);
	}
}
