package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminUserTest extends Base {
	HomePage home;
	AdminUserPage admin;
  @Test
  public void verifyuserisabletoaddadminuser() throws IOException {
	  String username=ExcelUtilities.getStringName(1, 0,"Loginpage");
	  String password=ExcelUtilities.getStringName(1, 1,"Loginpage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  home=login.clickLoginButton();
	  
	  String username1=ExcelUtilities.getStringName(1, 0,"Addadmin");
	  String password1=ExcelUtilities.getStringName(1, 1,"Addadmin");
	  admin=home.clickadminuserbutton();
	  admin.clicknewbutton();
	  admin.enterusernamefield(username1);
	  admin.enterpasswordfield(password1);
	  admin.clickusertypebutton();
	  admin.clicksavebutton();
	  
	  
	  boolean isAlertloaded=admin.isAlertload();
	  assertTrue(isAlertloaded,Constant.ERRORMSG3);
			  
	  
  }
}
