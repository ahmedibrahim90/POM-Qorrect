package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemCreatorLoginPage extends PageBase {

	public ItemCreatorLoginPage(WebDriver driver) {
		super(driver);
	}

	private By emailtxt = By.id("Username");
	private By passwordtxt = By.id("Password");
	private By loginBtn = By.cssSelector("button.btn.btn-primary.hide-in-seb");
	private By userNameAdmin = By.cssSelector("span.user-name");
	
	
	
	
	public void userLogin(String registeredEmail, String password)
	{
		clearBox(driver.findElement(emailtxt));
		settxtElementTxt(driver.findElement(emailtxt), registeredEmail);
		clearBox(driver.findElement(passwordtxt));
		settxtElementTxt(driver.findElement(passwordtxt), password);
		clickButton(driver.findElement(loginBtn));
	}
	
	public String getloginInvalidationMsg()
	{
		return driver.findElement(userNameAdmin).getText();
	}
}