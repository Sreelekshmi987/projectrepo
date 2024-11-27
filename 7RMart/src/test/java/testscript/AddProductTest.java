package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;
import pages.AddProductPage;

public class AddProductTest extends Base {
  @Test
  public void verifyuserisabletocreateproduct ()
  {
	  //String username=ExcelUtilities.getStringName(1, 0,"Loginpage");
	  // String password=ExcelUtilities.getStringName(1, 1,"Loginpage");
	  //String title=ExcelUtilities.getStringName(1, 0,"Addproduct");
	 // String weightvalue=ExcelUtilities.getStringName(1, 1,"Addproduct");
	  //String weightunit=ExcelUtilities.getStringName(1, 2,"Addproduct");
	  //String maxquantity=ExcelUtilities.getStringName(1, 3,"Addproduct");
	 // String price=ExcelUtilities.getStringName(1, 4,"Addproduct");
	  //String stockavailability=ExcelUtilities.getStringName(1, 5,"Addproduct");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  login.clickLoginButton();
	  
	  
	  AddProductPage product=new AddProductPage(driver);
  	  product.clickmanageproductbutton();
  	  product.clicknewbutton();
  	  product.entertitlefield("Mango");
  	  product.clickproducttype();
  	  product.clickcategorybutton();
  	  product.clicksubcategory();
  	  product.clickpricetype();
  	  product.enterweightvalue("500");
 	  product.enterweightunit("g");
 	  product.entermaxquantity("3");
 	  product.enterprice("100");
 	  product.enterstockavailability("3");
 	  product.clicksavebutton();
  }
}
