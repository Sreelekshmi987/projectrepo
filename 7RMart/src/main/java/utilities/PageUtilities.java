package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	WebDriver driver;
	public void selectByValue(WebElement dropdown,String value)
	{
	Select select=new Select(dropdown);
	  select.selectByValue(value);
}
	public void selectByVisibletext(WebElement dropdown,String visibletext)
	{
	Select select=new Select(dropdown);
	select.selectByVisibleText(visibletext);
}
	public void selectByIndex(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		  select.selectByIndex(index);
	}
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
			
		}
	public void scroll(WebDriver driver) {
		 JavascriptExecutor jsexec=(JavascriptExecutor) driver;
	     jsexec.executeScript("window.scrollBy(0,1000)");
	}
	}
	
