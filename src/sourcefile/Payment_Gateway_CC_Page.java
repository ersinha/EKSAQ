package sourcefile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_Gateway_CC_Page 
{
	WebDriver driver;
	//1.Locating element for each component
	
	@FindBy(xpath="//*[@id='cnumber']")
	WebElement cardnumber;
	
	@FindBy(xpath="//*[@id='expmon']")
	WebElement month;
	
	@FindBy(xpath="//*[@id='expyr']")
	WebElement year;
	
	@FindBy(xpath="//*[@id='cvv2']")
	WebElement cvv;
	
	@FindBy(xpath="//*[@id='cname2']")
	WebElement cardholdername;
	
	@FindBy(xpath="//*[@id='proceedForm']")
	WebElement paymentbutton;
	
	//2.Passing data in element for each component
	
	public void cardnumber()
	{
		cardnumber.sendKeys("4111111111111111");
	}
	public void cardmonth()
	{
		Select dpmonth= new Select(year);
		dpmonth.selectByIndex(5);
	}
	public void cardyear()
	{
		Select dpyrs= new Select(month);
		dpyrs.selectByIndex(8);
	}
	public void cvvnumber()
	{
		cvv.sendKeys("456");
	}
	public void cardholdername()
	{
		cardholdername.sendKeys("Rahul Kumar Sinha");
	}
	public void payment_button()
	{
		paymentbutton.click();
	}
	
	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Payment_Gateway_CC_Page	(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

}
