package sourcefile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page
{
	WebDriver driver;
	//1.Locating element for each component
		
	@FindBy(xpath="//*[@id=\"primary-menu\"]/li[4]/a")
	WebElement courcelink;
	
	@FindBy(xpath="//a[@title='RCA NAGARAM']")
	WebElement product;
	
	@FindBy(name="height_option")
	WebElement student;
	
	@FindBy(name="width_option")
	WebElement teacher;
	
	@FindBy(xpath="//button[@name='add-to-cart']")
	WebElement addtocart;
	
	@FindBy(linkText="View cart")
	WebElement viewcartpage;
	
	@FindBy(xpath="//a[@class='btn btn-theme btn-block alt wc-forward']")
	WebElement processpayment;
	
	
	@FindBy(xpath="(//i[@class='flaticon-shopping-bag'])[2]")
	WebElement checkouticon;
	
	@FindBy(xpath="(//a[@class='btn btn-theme btn-block checkout wc-forward'])[2]")
	WebElement checkoutbutton;
	
	//2.Passing data in element for each component

	
	public void gotocourcepage()
	{
		courcelink.click();
	}
	public void courcetype()
	{
		product.click();
	}
	public void student()
	{
		student.sendKeys("20");
	}
	public void teacher()
	{
		teacher.sendKeys("2");
	}
	public void cart() 
	{
		addtocart.click();
	}
	public void veiwcart() 
	{
		viewcartpage.click();
	}
	
	public void processtopayment() 
	{
		processpayment.click();
	}
	
	public void checkouticon() throws InterruptedException 
	{
		checkouticon.click();
		Thread.sleep(2000);
	}
	public void checkoutbutton() 
	{
		checkoutbutton.click();
	}
	
	
	
	
	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Home_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
