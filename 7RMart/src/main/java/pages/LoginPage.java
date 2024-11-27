package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public WebDriver driver;
 
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//input[@placeholder='Username']")WebElement username;
 @FindBy(xpath="//input[@placeholder='Password']")WebElement password;
 @FindBy(xpath="//button[@type='submit']")WebElement signin;
 
 @FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
 @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
 
 public LoginPage enterUsernameField(String usernamefield)
 {
	username.sendKeys(usernamefield);
	return this; 
 }
 public LoginPage enterPasswordField(String passwordfield)
 {
	password.sendKeys(passwordfield);
	return this; 
 }
 public HomePage clickLoginButton()
 {
	signin.click();
	return new HomePage(driver); 
 }
 public boolean isDashboardload()
 {
	 return dashboard.isDisplayed();
 }
 public boolean isAlertload()
 {
	 return alert.isDisplayed();
 }

}
