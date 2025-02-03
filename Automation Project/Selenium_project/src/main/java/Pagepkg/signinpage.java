package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
	WebDriver driver;

	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div[7]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div")
	WebElement show;
	@FindBy(xpath="//*[@id=\"root\"]/div[7]/div[2]/div[2]/div/div/form/div[4]/button")
	WebElement login;
	
	
	
	public signinpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void gotoo() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/div[2]/div[4]")).click();
	}
	
	public void insert(String passwords) throws Exception {
		Thread.sleep(20000);
		password.clear();
		password.sendKeys(passwords);
	}
	public void login() {
		show.click();
		login.click();
	}
}
