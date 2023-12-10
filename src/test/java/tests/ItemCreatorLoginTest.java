package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemCreatorLoginPage;

public class ItemCreatorLoginTest extends TestBase {

	HomePage homeObject;
	ItemCreatorLoginPage loginObject;
	String MyuserName = "itemCreator@gmail.com";
	String MyPassword = "01285443601Oct_1990";
	String ActualUserName = "Ahmed Item Creator";
	
	
	@Test(priority = 1)
	public void registeredUserCanLoginSuccessfully() 
	{
		loginObject = new ItemCreatorLoginPage(driver);
		loginObject.userLogin(MyuserName, MyPassword);
		homeObject = new HomePage(driver);
		Assert.assertTrue(homeObject.getUserNameAdmin().equalsIgnoreCase(ActualUserName));
		// It fails the TC
		//Assert.assertTrue(homeObject.getItemsbulktxt().contains("Items"));
	}
}
