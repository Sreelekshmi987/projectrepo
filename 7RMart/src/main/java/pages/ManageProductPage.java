package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
public WebDriver driver;
public ManageProductPage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
@FindBy(xpath="//input[@id='title']")WebElement title;
@FindBy(xpath="//input[@value='Veg']")WebElement producttype;
@FindBy(xpath="//select[@id='cat_id']")WebElement category;
@FindBy(xpath="//select[@id='sub_id']")WebElement subcategory;
@FindBy(xpath="//input[@value='weight']")WebElement pricetype;
@FindBy(xpath="//input[@id='m_weight']")WebElement weightvalue;
@FindBy(xpath="//select[@id='w_unit']")WebElement weightunit;
@FindBy(xpath="//input[@id='max_weight']")WebElement maxquantity;
@FindBy(xpath="//input[@id='w_price']")WebElement price;
@FindBy(xpath="//input[@name='w_stock']")WebElement stockavailability;
@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;

@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;


public ManageProductPage clicknewbutton()
{
	newbutton.click();
	return this;
}
public ManageProductPage entertitlefield(String titlefield)
{
	title.sendKeys(titlefield);
	return this;
}
public ManageProductPage clickproducttype()
{
  producttype.click();
  producttype.isSelected();
   return this;
}
public ManageProductPage clickcategorybutton() {
	category.click();
	return this;
}
public ManageProductPage clicksubcategory() {
	subcategory.click();
	return this;
}
public ManageProductPage clickpricetype()
{
    pricetype.click();
    pricetype.isSelected();
	return this;
}
public ManageProductPage enterweightvalue(String weightvaluefield)
{
	weightvalue.sendKeys(weightvaluefield);
	return this;	
}
public ManageProductPage enterweightunit(String weightunitfield) {
	weightunit.sendKeys(weightunitfield);
	return this;
}
public ManageProductPage entermaxquantity(String maxquantityfield) {
	maxquantity.sendKeys(maxquantityfield);
	return this;
}
public ManageProductPage enterprice(String pricefield) {
	price.sendKeys(pricefield);
	return this;
}
public ManageProductPage enterstockavailability(String stockavailabilityfield) {
	stockavailability.sendKeys(stockavailabilityfield);
	return this;
}
public ManageProductPage clicksavebutton()
{
	save.click();
	return this;

}
public boolean isAlertload() {
	return alert.isDisplayed();
}
}