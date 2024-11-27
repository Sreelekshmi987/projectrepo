package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchSubcategory {

	public WebDriver driver;
	public SearchSubcategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary'] ")WebElement searchbutton;
	@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement category;
	@FindBy(xpath=" //input[@placeholder='Sub Category']")WebElement subcategory;
	@FindBy(xpath=" //button[@type='submit']")WebElement search;
	
	public void clicksearchbutton()
	{
		searchbutton.click();
	}
	public void clickcategorybutton()
	{
		category.click();
		Select select=new Select(category);
		 select.selectByVisibleText("Vegetables");
	}
	public void entersubcategoryfield(String subcategoryfield)
	{
		subcategory.sendKeys(subcategoryfield);
	}
	public void clicksearch()
	{
		search.click();
	}
}
