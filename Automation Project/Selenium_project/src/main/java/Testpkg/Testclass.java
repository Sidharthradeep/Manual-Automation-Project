package Testpkg;

import java.net.URI;
import javax.net.ssl.HttpsURLConnection;
import org.testng.Assert;
import org.testng.annotations.Test;
import Basepkg.Baseclass;
import Excelutil.Excelutil;
import Pagepkg.Radio;
import Pagepkg.alert;
import Pagepkg.datepick;
import Pagepkg.dragpage;
import Pagepkg.dropdownpage;
import Pagepkg.movingtonewsite;
import Pagepkg.screenshotpage;
import Pagepkg.signinpage;
import Pagepkg.signuppage;
import Pagepkg.windowhandle;

public class Testclass extends Baseclass{
	
	
	@Test(priority=1)
	public void Response_check() throws Exception {
		System.out.println("Current URL: " + driver.getCurrentUrl());
		String link=driver.getCurrentUrl();
		URI uri=new URI(link);
		HttpsURLConnection connect=(HttpsURLConnection)uri.toURL().openConnection();
		int responsecode=connect.getResponseCode();
		Assert.assertEquals(responsecode,200,"HTTP RESPONSE VALIDATION FAILED");
		System.out.println(responsecode);
    }
	@Test(priority=2)
	public void signup() throws Exception {
		signuppage ob=new signuppage(driver);
		String x1="C:\\Users\\Sidharth Radeep\\Downloads\\projectexcel.xlsx";
		String sheet="signup";
		int rowcount=Excelutil.get_RowCount(x1,sheet);
		ob.gotoo();
		for(int i=2;i<rowcount;i++)
		{
			String name=Excelutil.get_StringValue(x1, sheet, i,0);
			String mobile=Excelutil.get_StringValue(x1, sheet, i,1);;
			String password=Excelutil.get_StringValue(x1, sheet, i,2);;		
			ob.signup(name,mobile, password);
		}
		ob.login();
		}
	@Test(priority=3)
	public void signin() throws Exception {
		signinpage ob=new signinpage(driver);
		String x1="C:\\Users\\Sidharth Radeep\\Downloads\\projectexcel.xlsx";
		String sheet="signin";
		int rowcount=Excelutil.get_RowCount(x1, sheet);
		ob.gotoo();
		for(int i=2;i<rowcount;i++)
		{
			String password=Excelutil.get_StringValue(x1, sheet, i,1);
			ob.insert(password);
			ob.login();
		}
	}
	@Test(priority=4)
	public void verify_handle() {
		windowhandle ob=new windowhandle(driver);
		ob.openlink();
	}
	@Test(priority=5)
	public void verify_hover() {
		dropdownpage ob=new dropdownpage(driver);
		ob.hover();
	}
	@Test(priority=6)
	public void verify_drag() {
		dragpage ob=new dragpage(driver);
		ob.dragging();
	}
	@Test(priority=7)
	public void verify_screenshot() throws Exception {
		screenshotpage ob=new screenshotpage(driver);
		ob.screenshot();
	}
	@Test(priority=8)
	public void verify_dragdrop()
	{
		movingtonewsite ob=new movingtonewsite(driver);
		ob.newwindow();
		ob.draganddrop();	
	}
	@Test(priority=9)
	public void verify_alert() {
		alert ob=new alert(driver);
		ob.newtab();
		ob.alerts();
	}
	@Test(priority=10)
	public void verify_radio() {
		Radio ob=new Radio(driver);
		ob.newtab();
		ob.radios();
	}
	@Test(priority=11)
	public void Verify_date() {
		datepick ob=new datepick(driver);
		ob.newtab();
		ob.datepicker();
	}
}