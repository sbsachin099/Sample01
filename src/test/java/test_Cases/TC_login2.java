package test_Cases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import page_Objects.Sauce_Demo;

public class TC_login2 extends Base_class01{
@Test
public void disp() throws InterruptedException {
	
	Sauce_Demo gp = new Sauce_Demo(driver);
	driver.get(url); 
	
	gp.enter_username(username);   //Calling method to enter Username
	gp.enter_password(password);   //Calling method to enter Password
	
	gp.clik_login();      
	Thread.sleep(3000);
	String pagetitle = driver.getTitle();
	if(pagetitle.equals("Swag Labs")) {
		
		
		Assert.assertTrue(true);
		Reporter.log("Test case is failed",true);
		
		
	}
	
	else {
		
		Reporter.log("Test case is failed",true);
		Assert.assertTrue(false);
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}




}
