package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ResetAdminUserPage {
public WebDriver driver;

public ResetAdminUserPage(WebDriver driver)
{
   this.driver=driver;
   PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@class='btn btn-default btn-fix']")WebElement resetbutton;

@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']")WebElement resetpage;

public ResetAdminUserPage clickresetbutton()
{
	WaitUtility wait=new WaitUtility();
	wait.waitForElementToBeSelected(driver, resetbutton);
	resetbutton.click();
	return this;
}
public boolean isResetload()
{
	return resetpage.isDisplayed();
}
}
