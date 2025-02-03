package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement name;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(id="mobile")
	WebElement mobile;
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[7]/div[2]/div[2]/div/div/form/button")
	WebElement login;
	
	public signuppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void gotoo() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/div[2]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div[2]/div[2]/div/div/div/div/span[2]")).click();
	}
	
	public void signup(String names,String number,String pass) throws Exception {		
		name.sendKeys(names);
		Thread.sleep(20000);
		mobile.sendKeys(number);
		password.sendKeys(pass);
	}
	
	public void login() {
		login.click();
	}
}
