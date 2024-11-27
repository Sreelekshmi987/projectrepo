package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAdminUser {
public WebDriver driver;

public SearchAdminUser(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
 @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
 @FindBy(xpath="//input[@id='un']")WebElement username;
 @FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
 
 @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")WebElement searchresult;
 
 public SearchAdminUser clicksearch()
 {
	 search.click();
	return this;
 }
 public SearchAdminUser enterusername(String usernamefield)
 {
	 username.sendKeys(usernamefield);
	return this;
 }
 public SearchAdminUser clicksearchbutton()
 {
	 searchbutton.click();
	return this;
 }
 public boolean isResultload()
 {
	 return searchresult.isDisplayed();
	 
 }
}
