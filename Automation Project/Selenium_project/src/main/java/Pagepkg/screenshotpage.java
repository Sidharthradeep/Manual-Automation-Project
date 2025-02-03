package Pagepkg;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshotpage {
	WebDriver driver;
	@FindBy(xpath=("//*[@id=\"root\"]/div[1]/header/div/div[1]/div/a/img"))
	WebElement img;
	
	public screenshotpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void screenshot() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[1]/div/a/img")));
		File ss=img.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("./Screenshot/car_image.png"));
	}
	
}
