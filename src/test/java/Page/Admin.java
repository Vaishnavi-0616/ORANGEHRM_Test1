package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin extends BasePage {
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\VOVAISHN\\eclipse-workspace\\ORANGEHRM_Test1\\src\\test\\resources\\Driver\\chromedriver.exe"
	 * ); WebDriver driver = new ChromeDriver();
	 * driver.get("https://opensource-demo.orangehrmlive.com/");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"
	 * ); driver.findElement(By.xpath("//button[@type='submit']")).click();
	 * driver.manage().window().maximize(); driver.findElement(By.
	 * xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).
	 * click(); driver.findElement(By.
	 * xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"
	 * )).click(); driver.findElement(By.
	 * xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).
	 * click(); WebElement dropdown =
	 * driver.findElement(By.xpath("//select[text()='-- Select --']")); Select sel =
	 * new Select(dropdown); Thread.sleep(5000); sel.selectByValue("Admin");
	 * driver.findElement(By.xpath("//input[@name='Employee Name']")).sendKeys(
	 * "Vaishnavi");
	 */
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminClick;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addClick;
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	private WebElement adminSelect;
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'][1])")
	private WebElement role;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employee;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	 public void admin()
	 {
		 adminClick.click();
	 }
	 public void add()
	 {
		 addClick.click();
	 }
	 public void adminSelect()
	 {
		 adminSelect.click();
	 }
	 public void role()
	 {
		 role.click();
	 }
	 public void employee(String string)
	 {
		 employee.sendKeys(string);
	 }
	 public void username(String string)
	 {
		 username.sendKeys(string);
	 }
	 public void password(String string)
	 {
		 password.sendKeys(string);
	 }
	 public void confirmPassword(String string)
	 {
		 confirmPassword.sendKeys(string);
	 }
	 public void saveBtn() {
		 saveBtn.click();
	 }
	 }	