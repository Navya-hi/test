package Hybrid;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logincrm extends Baseclass {

	
	@Test(priority=4)

	 public void Menuapp() throws InterruptedException
		
		{   Menu lopi5= PageFactory.initElements(driver,Menu.class);
			 lopi5.menn();
			     
			         
	    }
	@Test(priority=1)

	 public void Agreementappp() throws InterruptedException
		
		{   Agreement lopi2= PageFactory.initElements(driver,Agreement.class);
			 lopi2.agreeme();
			     
			         
	    }
	

   @Test(priority=6)

	 public void Aboutusapp() throws InterruptedException
		
		{ 
		     Aboutus lopi7= PageFactory.initElements(driver,Aboutus.class);
			 lopi7.aboutu();
			
			
	    }
	

	
	 @Test(priority=2)

	 public void payrentapp() throws InterruptedException
		
		{ 
		     payrent lopi3= PageFactory.initElements(driver,payrent.class);
			 lopi3.payre();

			     
	    }
	 @Test(priority=3)

	 public void Shortlistapp() throws InterruptedException
		
		{ 
		     Shortlist lopi4= PageFactory.initElements(driver,Shortlist.class);
			 lopi4.vist();

			     
	    }

	  @Test(priority=5)

      public void Hostel() throws InterruptedException
	
	   { 
	           Hostel lopi6= PageFactory.initElements(driver,Hostel.class);
		      lopi6.hostelp();
		     
       }
	 
}
