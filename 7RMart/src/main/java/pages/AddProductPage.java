package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
public WebDriver driver;
public AddProductPage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
@FindBy(xpath="//p[text()='Manage Product']")WebElement manageproduct;
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

public void clickmanageproductbutton() {
	manageproduct.click();
}
public void clicknewbutton()
{
	newbutton.click();
}
public void entertitlefield(String titlefield)
{
	title.sendKeys(titlefield);
}
public void clickproducttype()
{
  producttype.click();
  producttype.isSelected();
}
public void clickcategorybutton() {
	category.click();
}
public void clicksubcategory() {
	subcategory.click();
}
public void clickpricetype()
{
    pricetype.click();
    pricetype.isSelected();
}
public void enterweightvalue(String weightvaluefield)
{
	weightvalue.sendKeys(weightvaluefield);	
}
public void enterweightunit(String weightunitfield) {
	weightunit.sendKeys(weightunitfield);
}
public void entermaxquantity(String maxquantityfield) {
	maxquantity.sendKeys(maxquantityfield);
}
public void enterprice(String pricefield) {
	price.sendKeys(pricefield);
}
public void enterstockavailability(String stockavailabilityfield) {
	stockavailability.sendKeys(stockavailabilityfield);
}
public void clicksavebutton()
{
	save.click();

}
}