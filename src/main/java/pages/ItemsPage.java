package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsPage extends PageBase {

	public ItemsPage(WebDriver driver) {
		super(driver);
	}

	private By createItemBtn = By.id("createNewItemDropdown");
	private By createItemTxtBtn = By.cssSelector("#createNewItemDropdown > span");
	private By TFBtn = By.xpath("/html/body/app-root/div/app-application/div/div/div/div/app-list-items/div/app-subheader/div/div/div[2]/div/div/div[2]/a[1]");

	public void openCreateTFItemPage()
	{
		clickButton(driver.findElement(createItemBtn));
		clickButton(driver.findElement(TFBtn));
	}

	public String getcreateItemTxtBtn()
	{
		return driver.findElement(createItemTxtBtn).getText();
	}
}
