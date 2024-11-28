package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	HomePage homepage;
  @Test
  public void verifyuserisabletologout() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  homepage=login.clickLoginButton();
	  homepage.clickAdminButton();
	  homepage.clickLogoutButton();
	  
	  
	 assertEquals(driver.getTitle(),"Login | 7rmart supermarket","Logout Failed");
	 
  }
}
