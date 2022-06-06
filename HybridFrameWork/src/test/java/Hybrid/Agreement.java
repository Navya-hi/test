package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Agreement {
	WebDriver driver;

	public Agreement(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@id=\'raHomeTile\']") WebElement Agreement_ag;
	

 public void agreeme() throws InterruptedException
 {
	 Agreement_ag.click();
	
	 
	 Helperclass.captureScreenshots(driver);

 }
}


