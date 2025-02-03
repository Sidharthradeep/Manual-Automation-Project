package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dragpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div")
	WebElement click;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/button[1]")
	WebElement firstbut;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/button[2]")
	WebElement secondbut;

	public dragpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void dragging() {
		Actions act=new Actions(driver);
		act.dragAndDropBy(click, 52,47);
	}
}
