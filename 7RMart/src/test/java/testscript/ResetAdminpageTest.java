package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetAdminUserPage;
import pages.SearchAdminUser;

public class ResetAdminpageTest extends Base {
	HomePage home;
	AdminUserPage admin;
	SearchAdminUser search;
	ResetAdminUserPage reset;
@Test

	public void verifyuserisabletoresetthepage()
	{
		/* LoginPage login=new LoginPage(driver);
		 home=login.clickLoginButton();
		  login.enterUsernameField(username);
		  login.enterPasswordField(password);
		  login.clickLoginButton();*/
		  
		 // AdminUserPage admin=new AdminUserPage(driver);
		  admin=home.clickadminuserbutton();
		  
		  
		  //SearchAdminUser search=new SearchAdminUser(driver);
		  search.clicksearch();
		  search.enterusername("sree");
		  search.clicksearchbutton();
		  
		  //ResetAdminUserPage reset=new ResetAdminUserPage(driver);
		  reset.clickresetbutton();
		  
		  boolean isResetloaded=reset.isResetload();
		  assertTrue(isResetloaded,"Table not displayed");
	}
	
}
