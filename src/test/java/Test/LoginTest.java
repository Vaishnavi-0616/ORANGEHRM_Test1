package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Page.Admin;
import Page.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void Login() throws InterruptedException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clicklogin();
		Thread.sleep(5000);

		Admin admin = new Admin();
		admin.admin();
		admin.add();
		admin.adminSelect();
		admin.role();
		Thread.sleep(5000);
		admin.employee("Dominic  Chase");
		admin.username("Vodnalavaishnavi");
		admin.password("Vodnala1@123");
		admin.confirmPassword("Vodnala1@123");// admin.saveBtn();
	}
}
