package sourcefile;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Payment_Profile_Page 
{
	WebDriver driver;
	//1.Locating element for each component
	
	@FindBy(id="billing_first_name")
	WebElement firstname;
	
	@FindBy(id="billing_last_name")
	WebElement lastname;
	
	@FindBy(id="billing_address_1")
	WebElement address;
	
	@FindBy(id="billing_city")
	WebElement City_Town;
	
	@FindBy(xpath="//*[@id='select2-billing_state-container']")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement drpdownauto;
	
	@FindBy(id="billing_postcode")
	WebElement Zip_Code;
	
	@FindBy(id="billing_phone")
	WebElement Phone_No;
	
	@FindBy(id="billing_email")
	WebElement Email;
	
	// Order Part
	
	@FindBy(xpath ="(//*[@name='payment_method'])[2]")
	WebElement radiobutton_2;
	
	@FindBy(xpath="//*[@id='place_order']")
	WebElement place_order;
	
	//2.Passing data in element for each component
	
	public void firstname()
	{
		firstname.clear();
		firstname.sendKeys("Rahul");
	}
	public void lastname() 
	{
		lastname.clear();
		lastname.sendKeys("Sinha");
	}
	public void address() 
	{
		address.clear();
		address.sendKeys("KR Puram Bengaluru");
	}
	public void city() 
	{
		City_Town.clear();
		City_Town.sendKeys("Bengaluru");
	}
	public void dropdwon() 
	{
		dropdown.click();
	}
	
	public void alldropdwon() 
	{
		drpdownauto.sendKeys("Karnataka");
		drpdownauto.sendKeys(Keys.ENTER);
	}
	
	public void zipcode() 
	{
		Zip_Code.clear();
		Zip_Code.sendKeys("560036");
	}
	public void phone_no() 
	{
		Phone_No.clear();
		Phone_No.sendKeys("9155333435");
	}
	public void email() 
	{
		Email.clear();
		Email.sendKeys("er.sinha66@gmail.com");
	}
	public void billdeskradiobutton() 
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.titleIs(driver.getTitle()));
		radiobutton_2.click();
	}
	public void place_order() throws InterruptedException 
	{
		place_order.click();
		Thread.sleep(5000);
	}



	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
		public Payment_Profile_Page	(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	

}
