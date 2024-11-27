package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base {
  @Test
  public void verifytheuserisabletocreatesubcategory() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  login.clickLoginButton();
	  
	  SubCategoryPage category=new SubCategoryPage(driver);
	  category.clicksubcategorybutton();
	  category.clicknewbutton();
	  category.clickcategorybutton();
	  category.entersubcategory("Fruit");
	  category.clickimage();
  }
}
