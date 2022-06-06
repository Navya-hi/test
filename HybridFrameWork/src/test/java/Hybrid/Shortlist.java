package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Shortlist {
	WebDriver driver;

	public Shortlist(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div//a[@class=\'nb__BXOsd\']") WebElement shortlist;
	public void vist() throws InterruptedException
	 {
		shortlist.click();
	    Helperclass.captureScreenshots(driver);

		 
	 }
}

