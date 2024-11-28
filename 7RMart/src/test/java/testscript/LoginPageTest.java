package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginPageTest extends Base {
	@DataProvider(name = "credentials")
	public Object[][] testData() {// data provider
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "admin@123";
		input[1][1] = "admin123";
		return input;
		}

  @Test(dataProvider = "credentials")
  public void verifyuserisabletologinvalidcredentials(String username,String password) throws IOException {
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  login.clickLoginButton();
	  
	  boolean isdashboardloaded=login.isDashboardload();
	    assertTrue(isdashboardloaded,Constant.ERRORMSG);
}
  @Test
  @Parameters({"username","password"})
 
  public void verifyuserisabletologininvalidusername() {
	  LoginPage login1=new LoginPage(driver);
	  login1.enterUsernameField("admin1#");
	  login1.enterPasswordField("admin");
	  login1.clickLoginButton();
	  
	  boolean isAlertloaded=login1.isAlertload();
    assertTrue(isAlertloaded,Constant.ERRORMSG2);
  }
  @Test(groups = {"smoke"})
  public void verifyuserisabletologininvalidpassword() {
	  LoginPage login2=new LoginPage(driver);
	  login2.enterUsernameField("admin");
	  login2.enterPasswordField("admin@");
	  login2.clickLoginButton();
	  
	  boolean isAlertloaded=login2.isAlertload();
    assertTrue(isAlertloaded,Constant.ERRORMSG2);
}
  @Test(groups = {"smoke"})
  public void verifyuserisabletologininvalidcredentials() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin1#");
	  login.enterPasswordField("admin@");
	  login.clickLoginButton();
	  
	  boolean isAlertloaded=login.isAlertload();
    assertTrue(isAlertloaded,Constant.ERRORMSG2);
}
}

 