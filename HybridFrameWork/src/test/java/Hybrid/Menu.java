package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Menu {
	WebDriver driver;

	public Menu(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@id=\'main-menu\']") WebElement showit;
	@FindBy(xpath="//*[@id=\"main-menu\"]/div[2]/a[4]") WebElement refer;
	public void menn() throws InterruptedException
	 {
		showit.click();
	    Helperclass.captureScreenshots(driver);
		 refer.click();
		 
	 }
}
