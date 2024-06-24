package test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import page_Objects.Sauce_Demo;

public class Test_login extends Base_class01{

	    @Test(priority = 1)
	
	    void test_login() throws InterruptedException, IOException {
	  
	
		Sauce_Demo gp = new Sauce_Demo(driver);
		driver.get(url);               //Enter URL
		
		Thread.sleep(3000);
		gp.enter_username(username);   //Calling method to enter Username
		gp.enter_password(password);   //Calling method to enter Password
		
		gp.clik_login();               //Calling method to Click on Login button
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html")) {
			gp.get_all_elements();
			System.out.println("Expected Page Title got  matched");
			Assert.assertTrue(true);
			
			
		}

		else {
			capture_Screenshot("Test_login");
			System.out.println("Captured Failed Test case Screenshot");
			System.out.println("Expected Page Title Not matched");
			Assert.assertTrue(false);
		}
		
  
	
	}
	    
	    
	    
	    
	    
	    @Test(priority = 2)
	    public void disp() {
	    	
	    	Reporter.log("Hi Sachin : this is sceond test method",true);
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
}
