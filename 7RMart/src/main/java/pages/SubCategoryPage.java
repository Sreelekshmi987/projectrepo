package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;

public class SubCategoryPage {
public WebDriver driver;
public SubCategoryPage(WebDriver driver)
{
   this.driver=driver;
   PageFactory.initElements(driver,this);
}
@FindBy(xpath="//p[text()='Sub Category']")WebElement subcategorybutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement selectcategory;
@FindBy(xpath="//input[@id='subcategory']")WebElement subcategory;
@FindBy(xpath="//input[@name='main_img']")WebElement image;


public void clicksubcategorybutton()
{
	subcategorybutton.click();
}
public void clicknewbutton() 
{
	newbutton.click();	
}
public void clickcategorybutton()
{
	PageUtilities page=new PageUtilities();
	page.selectByVisibletext(selectcategory, "mango");
	selectcategory.click();
	
}
public void entersubcategory(String subcategoryfield)
{
	subcategory.sendKeys(subcategoryfield);
}
public void clickimage()
{
	image.click();
}
}
