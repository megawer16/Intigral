package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	protected Select select ;
	public JavascriptExecutor jse ;

	public PageBase (WebDriver driver)
	{
		this.driver = driver;
	}

	protected static void clickButton(WebElement button) 
	{
		button.click();
	}

	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}

	public void scrollToBottom() 

	{
		jse.executeScript("scrollBy(0,2500)"); 
	}

	public void clearText(WebElement element) 
	{
		element.clear();
	}
}
