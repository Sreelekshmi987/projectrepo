package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchSubcategory;
import pages.SubCategoryPage;

public class SearchSubcategoryTest extends Base{
  @Test
  public void verifyuserisabletosearchsubcategory() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameField("admin");
	  login.enterPasswordField("admin");
	  login.clickLoginButton();
	  
	  SubCategoryPage subcategory=new SubCategoryPage(driver);
	  subcategory.clicksubcategorybutton();
	  
	  SearchSubcategory search=new SearchSubcategory(driver);
	  search.clicksearchbutton();
	  search.clickcategorybutton();
	  search.entersubcategoryfield("mushroom");
	  search.clicksearch();
  }
}
