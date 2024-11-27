package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class AdminUserPage {
public WebDriver driver;

public AdminUserPage(WebDriver driver)
{
   this.driver=driver;
   PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//input[@id='username']")WebElement username;
@FindBy(xpath="//input[@id='password']")WebElement password;
@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
@FindBy(xpath="//button[@name='Create']")WebElement save;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;


public AdminUserPage clicknewbutton()
{
	WaitUtility wait=new WaitUtility();
	wait.waitForElementtobeClickable(driver, newbutton);
    newbutton.click();
	return this;	
}
public AdminUserPage enterusernamefield(String usernamefield)
{
  username.sendKeys(usernamefield);
  return this;	
}
public AdminUserPage enterpasswordfield(String passwordfield)
{
  password.sendKeys(passwordfield);
  return this;	
}
public AdminUserPage clickusertypebutton()
{
	PageUtilities page=new PageUtilities();
	page.selectByValue(usertype,"admin");
    usertype.click();
	return this;
}
public AdminUserPage clicksavebutton()
{
  save.click();
  return this;	
}
public boolean isAlertload()
{
  	return alert.isDisplayed();
}
}
