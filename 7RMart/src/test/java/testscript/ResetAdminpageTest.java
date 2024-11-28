package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constant.Constant;
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
		  admin=home.clickadminuserbutton();
		  
		  search.clicksearch();
		  search.enterusername("sree");
		  search.clicksearchbutton();
		  
		  reset.clickresetbutton();
		  
		  boolean isResetloaded=reset.isResetload();
		  assertTrue(isResetloaded,Constant.ERRORMSG6);
	}
	
}
