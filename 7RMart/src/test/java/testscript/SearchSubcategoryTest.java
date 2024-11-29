package testscript;

import static org.testng.Assert.assertTrue;

import javax.naming.directory.SearchResult;

import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchSubcategory;
import pages.SubCategoryPage;

public class SearchSubcategoryTest extends Base{
	HomePage home;
	SubCategoryPage category;
	SearchSubcategory search;
  @Test
  public void verifyuserisabletosearchsubcategory() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  home=login.clickLoginButton();
	  
	  category=home.clicksubcategorybutton();
	  
	  
	  search=category.clickcategorybutton();
	  search.clickcategorybutton();
	  search.entersubcategoryfield("mushroom");
	  search.clicksearch();
	  
	  boolean isResultloaded=search.isResultload();
	  assertTrue(isResultloaded,Constant.ERRORMSG6);
  }
}
