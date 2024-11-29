package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtilities;

public class SubCategoryPage {
public WebDriver driver;
public SubCategoryPage(WebDriver driver)
{
   this.driver=driver;
   PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement selectcategory;
@FindBy(xpath="//input[@id='subcategory']")WebElement subcategory;
@FindBy(xpath="//input[@name='main_img']")WebElement image;
@FindBy(xpath="//button[@name='create']")WebElement save;

@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;



public SubCategoryPage clicknewbutton() 
{
	newbutton.click();
	return this;	
}
public SearchSubcategory clickcategorybutton()
{
	PageUtilities page=new PageUtilities();
	page.selectByVisibletext(selectcategory, "mango");
	selectcategory.click();
	return new SearchSubcategory(driver) ;
	
}
public SubCategoryPage entersubcategory(String subcategoryfield)
{
	subcategory.sendKeys(subcategoryfield);
	return this;
}
public void imagefileupload() {
	FileUploadUtility fileupload=new FileUploadUtility();
	fileupload.sendkeysFileUpload(image, Constant.MANGOIMAGE);
	}
public SubCategoryPage clicksavebutton()
{
	save.click();
	return this;
} 
public boolean isAlertload() {
	return alert.isDisplayed();
}
}
