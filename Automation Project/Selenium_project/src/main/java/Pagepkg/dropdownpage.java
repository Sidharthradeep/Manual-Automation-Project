package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dropdownpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[2]/div")
	WebElement usedcars;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[2]/div[2]/div[1]/ul/div/div/div")
	WebElement drop;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[2]/div[2]/div[2]/div/div/div/ul/li[4]/a/div/div/div/img")
	WebElement img;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[2]/div[2]/section/div[1]/div/div/div[2]/div[2]/div/div/select")
	WebElement year;

	public dropdownpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void hover() {
		Actions act=new Actions(driver);
		act.moveToElement(usedcars).build().perform();
		drop.click();
		img.click();
		Select dropdown=new Select(year);
		dropdown.selectByVisibleText("Price - High to Low");
	}
	
}
