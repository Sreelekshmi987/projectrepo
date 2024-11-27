package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
public WebDriver driver;

public ManageNewsPage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
@FindBy(xpath="//p[text()='Manage News']")WebElement managenewsbutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
@FindBy(xpath="//button[@type='submit']")WebElement save;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
public void clickmanagenewsbutton()
{
	WaitUtility wait=new WaitUtility();
	wait.waitForVisibilityOfElementLocated(driver,managenewsbutton);
	managenewsbutton.click();
}
public void clicknewbutton()
{
	newbutton.click();	
}
public void enternewsfield(String newsfield)
{
	enternews.sendKeys(newsfield);	
}
public void clicksavebutton()
{
    save.click();	
}
public boolean isAlertload()
{
     return alert.isDisplayed();	
}
}