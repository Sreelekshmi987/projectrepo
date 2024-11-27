package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;

public HomePage(WebDriver driver)
{
  this.driver=driver;
  PageFactory.initElements(driver,this);
}
@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")WebElement adminuser;
@FindBy(xpath="//img[@class='img-circle']")WebElement admin;
@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;

public AdminUserPage clickadminuserbutton()
{
  adminuser.click();
return new AdminUserPage(driver);	
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
