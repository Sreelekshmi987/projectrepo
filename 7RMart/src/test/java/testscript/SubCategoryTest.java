package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base {
	HomePage home;
	SubCategoryPage category;
  @Test
 
  public void verifytheuserisabletocreatesubcategory() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  home=login.clickLoginButton();
	  
	  category=home.clicksubcategorybutton();
	  category.clicknewbutton();
	  category.clickcategorybutton();
	  category.entersubcategory("Fruit");
	  category.clicksavebutton();
  	  
	  	boolean isAlertloaded=category.isAlertload();
	  	assertTrue(isAlertloaded,Constant.ERRORMSG7);
  }
}
