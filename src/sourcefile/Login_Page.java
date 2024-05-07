package sourcefile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;

	//Locating element for each component	
	@FindBy(id="wdm_username")
	WebElement usename;
	
	@FindBy(id="wdm_password")
	WebElement pwdfield;
	
	@FindBy (name="wdm_login")
	WebElement loginbutton;
		
	
		
	//Passing data in element for each component
	
	public void username()
	{
		usename.sendKeys("testorguat1@mailinator.com");
	}
	 
	public void pass() 
	{
		pwdfield.sendKeys("Abcd@123");
	}
	public void login()
	{
		loginbutton.click();
	}
	
	//Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
