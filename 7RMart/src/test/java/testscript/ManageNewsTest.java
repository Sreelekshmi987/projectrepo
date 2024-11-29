package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
	HomePage home;
	ManageNewsPage manage;
  @Test(retryAnalyzer = retry.Retry.class)
  public void verifytheuserisabletocreatenews() throws IOException {
	  
	  String username=ExcelUtilities.getStringName(1, 0,"Loginpage");
	  String password=ExcelUtilities.getStringName(1, 1,"Loginpage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  home=login.clickLoginButton();
	  
	 String enternews=ExcelUtilities.getStringName(1, 0,"Managenews");
	  manage=home.clickmanagenewsbutton();
	  manage.clicknewbutton();
	  manage.enternewsfield(enternews);
	  manage.clicksavebutton();
	  
	  
	  
	  boolean isAlertloaded=manage.isAlertload();
	  assertTrue(isAlertloaded,Constant.ERRORMSG5);
  }
}
