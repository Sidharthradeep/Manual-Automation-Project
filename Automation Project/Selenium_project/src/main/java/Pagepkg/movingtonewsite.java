package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class movingtonewsite {
	WebDriver driver;
	String parent;
	
	@FindBy(xpath="//*[@id=\"angular\"]")
	WebElement pic1;
	
	@FindBy(xpath="//*[@id=\"mongo\"]")
	WebElement pic2;
	
	@FindBy(id="node")
	WebElement pic3;
	
	@FindBy(xpath="//*[@id=\"droparea\"]")
	WebElement end;
	
	public movingtonewsite(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void newwindow() {
		parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demo.automationtesting.in/Static.html");		
	}
	
	public void draganddrop(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(pic1));
		Actions act=new Actions(driver);
		act.dragAndDrop(pic1,end).build().perform();
		wait.until(ExpectedConditions.visibilityOf(end));
		act.dragAndDrop(pic2, end).build().perform();
		wait.until(ExpectedConditions.visibilityOf(end));
		act.dragAndDrop(pic3, end).build().perform();
		driver.switchTo().window(parent);
	}
	
}
