package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Aboutus {
	WebDriver driver;

	public Aboutus(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@class=\'nb__3N2G9 nb__2WC_s\']") WebElement about_ss;
	
 public void aboutu() throws InterruptedException
 {
	 about_ss.click();

		Helperclass.captureScreenshots(driver);

	 Helperclass.captureScreenshots(driver);
	 Thread.sleep(500);

 }
}

