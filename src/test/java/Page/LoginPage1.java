package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage1{
	
	@FindBy(xpath="//a[@href='/login']")
	private WebElement btnClick;
	@FindBy(xpath="//input[@id='Email']")
	private WebElement enterEmail;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement enterPassword;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement clickLogin1;
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	private WebElement computerClick;
	@FindBy(xpath="//img[@alt='Picture for category Desktops']")
	private WebElement desktopClick;
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement addtocartClick;
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement addtocart1Click;
	
	

	
	
	
	public void clicklogin()
	{
		btnClick.click();
	}
	public void emailId(String string)
	{
		enterEmail.sendKeys(string);
	}
	public void password(String string)
	{
		enterPassword.sendKeys(string);
	}
	public void clickLogin()
	{
		clickLogin1.click();
	}
	public void clickComputers()
	{
		computerClick.click();
	}
	public void clickDesktops()
	{
		desktopClick.click();
	}
	public void clickAddtocart()
	{
		addtocartClick.click();
	}
	public void clickAddtocart1()
	{
		addtocart1Click.click();
	}
	
	
	

}
