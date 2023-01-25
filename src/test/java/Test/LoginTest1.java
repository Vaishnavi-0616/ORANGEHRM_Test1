package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;

import Page.LoginPage1;

public class LoginTest1 extends BaseTest1 {
	@Test
	public void Login() throws InterruptedException {
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
		LoginPage1 page = new LoginPage1();
		page.clicklogin();
		page.emailId("vaishu@gmail.com");
		page.password("vaishu");
		page.clickLogin();
		page.clickComputers();
		page.clickDesktops();
		page.clickAddtocart();
		page.clickAddtocart1();
		
		
		

}
}
