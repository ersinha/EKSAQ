package sourcefile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page
{
	WebDriver driver;
	
	//1.Locating element for each component
		@FindBy(linkText="Login")
		WebElement loginlink;
	
		
	//Passing data in element for each component
		public void gotologinpage()
		{
			loginlink.click();
		}
			

		//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Main_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
