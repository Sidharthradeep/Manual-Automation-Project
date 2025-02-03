package Pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datepick {
	WebDriver driver;
	String parent;

	@FindBy(id="datepicker1")
	WebElement pick;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
	WebElement next;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a")
	List<WebElement> monthdate;
	
	public datepick(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void newtab() {
		parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
	}
	
	public void datepicker() {
		pick.click();
		while(true) {
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			if(month.equals("March")) {
				if(year.equals("2025")) {
					break;
				}
			}	
			else
			{
				next.click();
			}
		}
		for(WebElement lb:monthdate) {
			String get=lb.getText();
			if(get.equals("20")) {
				lb.click();
				break;
			}
	}
}
}