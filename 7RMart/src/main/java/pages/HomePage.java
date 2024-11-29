package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
public WebDriver driver;

public HomePage(WebDriver driver)
{
  this.driver=driver;
  PageFactory.initElements(driver,this);
}
@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")WebElement adminuser;
@FindBy(xpath="//p[text()='Manage News']")WebElement managenewsbutton;
@FindBy(xpath="//p[text()='Manage Product']")WebElement manageproduct;
@FindBy(xpath="//p[text()='Sub Category']")WebElement subcategorybutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary'] ")WebElement searchbutton;
@FindBy(xpath="//img[@class='img-circle']")WebElement admin;
@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;


public AdminUserPage clickadminuserbutton()
{
  adminuser.click();
return new AdminUserPage(driver);	
}
public ManageNewsPage clickmanagenewsbutton()
{
	WaitUtility wait=new WaitUtility();
	wait.waitForVisibilityOfElementLocated(driver,managenewsbutton);
	managenewsbutton.click();
	return new ManageNewsPage(driver);
}
public ManageProductPage clickmanageproductbutton() {
	manageproduct.click();
	return new ManageProductPage(driver);
}
public SubCategoryPage clicksubcategorybutton()
{
	subcategorybutton.click();
	return new SubCategoryPage(driver);
}
public SearchSubcategory clicksearchbutton()
{
	searchbutton.click();
	return new SearchSubcategory(driver);
}
public void clickAdminButton()
{
    admin.click();	
}
public void clickLogoutButton()
{
   logout.click();	
}

}
