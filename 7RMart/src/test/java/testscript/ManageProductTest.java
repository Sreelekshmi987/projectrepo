package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import pages.ManageProductPage;

public class ManageProductTest extends Base {
	HomePage home;
	ManageProductPage product;
  @Test
  @Parameters({"title","weightvalue","weightunit","maxquantity","price","stockavailability"})
  public void verifyuserisabletocreateproduct (String title, String weightvalue, String weightunit, String maxquantity, String price, String stockavailability)
  {
	
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  home=login.clickLoginButton();
	  
	 
  	  product=home.clickmanageproductbutton();
  	  product.clicknewbutton();
  	  product.entertitlefield(title);
  	  product.clickproducttype();
  	  product.clickcategorybutton();
  	  product.clicksubcategory();
  	  product.clickpricetype();
  	  product.enterweightvalue(weightvalue);
 	  product.enterweightunit(weightunit);
 	  product.entermaxquantity(maxquantity);
 	  product.enterprice(price);
 	  product.enterstockavailability(stockavailability);
 	  product.clicksavebutton();
 	  
 	 boolean isAlertloaded=product.isAlertload();
	  assertTrue(isAlertloaded,Constant.ERRORMSG7);
  }
}
