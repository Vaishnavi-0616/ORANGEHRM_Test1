package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.DriverUtils;

public class BasePage1 {
	WebDriver driver;
	public BasePage1()
	{
		driver=DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

}
