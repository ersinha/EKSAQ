package testfile;
import org.testng.annotations.Test;
import sourcefile.Home_Page;
import sourcefile.Login_Page;
import sourcefile.Main_Page;
import sourcefile.Payment_Gateway_CC_Page;
import sourcefile.Payment_Profile_Page;

public class Senario_1 extends Lounch_Quit
{	
	
	@Test
	public void end_to_end() throws InterruptedException 
	{
		//Calling Main Page Methods
		Main_Page mnpg = new Main_Page(driver);
		mnpg.gotologinpage();
		
		//Calling login Page Method
		Login_Page lgpg= new Login_Page(driver);
		lgpg.username();
		lgpg.pass();
		lgpg.login();
		
		//Calling Home Page Methods	
		Home_Page hmpg= new Home_Page(driver);
		hmpg.gotocourcepage();
		hmpg.courcetype();
		hmpg.student();
		hmpg.teacher();
		hmpg.cart();
		hmpg.veiwcart();
		//hmpg.processtopayment();
		hmpg.checkouticon();
		hmpg.checkoutbutton();
		
		//Calling Payment_Profile_Page Methods
		Payment_Profile_Page pymntpg= new Payment_Profile_Page(driver);
		pymntpg.firstname();
		pymntpg.lastname();
		pymntpg.address();
		pymntpg.city();
		pymntpg.dropdwon();
		Thread.sleep(3000);
		pymntpg.alldropdwon();
		pymntpg.zipcode();
		pymntpg.phone_no();
		pymntpg.email();
		Thread.sleep(3000);
		
		pymntpg.billdeskradiobutton();
		pymntpg.place_order();
		
		//Calling Payment_Gateway_Page Methords
		
		Payment_Gateway_CC_Page pygateway= new Payment_Gateway_CC_Page(driver);
		pygateway.cardnumber();
		pygateway.cardmonth();
		pygateway.cardyear();
		pygateway.cvvnumber();
		pygateway.cardholdername();
		pygateway.payment_button();
	}

}
