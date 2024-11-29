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

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
@FindBy(xpath="//button[@type='submit']")WebElement save;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;

public ManageNewsPage clicknewbutton()
{
	newbutton.click();
	return this;	
}
public ManageNewsPage enternewsfield(String newsfield)
{
	enternews.sendKeys(newsfield);
	return this;	
}
public ManageNewsPage clicksavebutton()
{
    save.click();
	return this;	
}
public boolean isAlertload()
{
     return alert.isDisplayed();	
}
}