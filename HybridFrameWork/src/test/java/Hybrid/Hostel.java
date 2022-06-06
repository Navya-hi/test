package Hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Hostel {
	WebDriver driver;

	public Hostel(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//*[@id=\'app\']/div/div/div[7]/div[1]/div/div[1]/div/div[3]") WebElement Hostel_pg;
	@FindBy(xpath="//*[@id=\'app\']/div/div/div[7]/div[1]/div/div[2]/div[2]/div[2]/div[4]/a") WebElement mum_lo;
	public void hostelp() throws InterruptedException
	 {
		Hostel_pg.click();
		
		 Helperclass.captureScreenshots(driver);
		 mum_lo.click();
	 }
}
