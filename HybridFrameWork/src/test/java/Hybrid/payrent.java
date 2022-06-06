package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class payrent {
	WebDriver driver;
	public payrent(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@class=\'nb__3sden\']") WebElement pay_rent;
	public void payre() throws InterruptedException
	 {
		 pay_rent.click();
		 Thread.sleep(500);
		 Helperclass.captureScreenshots(driver);

	 }
}



	




