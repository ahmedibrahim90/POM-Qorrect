package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By userNameAdmin = By.cssSelector("span.user-name");
	private By itemsBulk = By.cssSelector("span.ripple-title");
	

	public String getUserNameAdmin()
	{
		return driver.findElement(userNameAdmin).getText();
	}

	public String getItemsbulktxt()
	{
		return driver.findElement(itemsBulk).getText();
	}
	
	public void openItemsPage()
	{
		clickButton(driver.findElement(itemsBulk));
	}
}
