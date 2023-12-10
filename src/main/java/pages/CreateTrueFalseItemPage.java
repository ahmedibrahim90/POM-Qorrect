package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTrueFalseItemPage extends PageBase {

	public CreateTrueFalseItemPage(WebDriver driver) {
		super(driver);
	}
	
	private By questionStemTxtArea = By.xpath("/html/body/app-root/div/app-application/div/div/div/div/app-add-edit-item-tf/div/div[2]/app-add-edit-tf-basic/div/app-add-edit-question/qorrect-card-collapse/div/div[2]/div/div/qorrect-ckeditor-decoupled/div/div[2]/ckeditor/div[2]/p");
	private By falseSelectionBtn = By.xpath("/html/body/app-root/div/app-application/div/div/div/div/app-add-edit-item-tf/div/div[2]/app-add-edit-tf-basic/div/app-add-edit-answers/div/div[2]/app-add-edit-tf-answer[2]/div/div/div[2]/div/div[1]/div[2]/div/label/span");
	private By SaveBtn = By.cssSelector("button.btn.btn-primary.btn-loader");
	private By savedItemSuccessMsg = By.cssSelector("p.notifier__notification-message.ng-star-inserted");
	private By pageTileTrueFalse = By.xpath("/html/body/app-root/div/app-application/div/div/div/div/app-add-edit-item-tf/div/app-add-edit-header/app-subheader/div/div/div[1]/h1/span");

	public String getpageTileTrueFalse()
	{
		return driver.findElement(pageTileTrueFalse).getText();
	}
	
	public void TrueFalseItemCreation(String questionStemTxt)
	{
		clearBox(driver.findElement(questionStemTxtArea));
		settxtElementTxt(driver.findElement(questionStemTxtArea), questionStemTxt);
		clickButton(driver.findElement(falseSelectionBtn));
		clickButton(driver.findElement(SaveBtn));
	}
	
	public String getsavedItemSuccessMsg()
	{
		 return driver.findElement(savedItemSuccessMsg).getText();
	}
}
