package page_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Sauce_Demo {
	WebDriver driver;

	
	@FindBy(xpath = "//input[@id='user-name']")
	protected WebElement username;                               // Storing Username address
	
	@FindBy(xpath = "//input[@id='password']")
	protected WebElement password;                                // Storing Password address
	
	@FindBy(xpath = "//input[@id='login-button']")
	protected WebElement button;                                   // Storing login button address
	
	
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	protected List<WebElement> elements_price_list;                    //Storing address of Prices of all products
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	protected List<WebElement> products_name;
	
	
	public Sauce_Demo(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	
	}
	
	
    //Enter Username into Username field
    public void enter_username(String usn) {
		
	username.sendKeys(usn);
		
		
	}

   //Enter Password into Password field
   public void enter_password(String pwd) {
	
	password.sendKeys(pwd);
		
		
	}

  //Click on Login button
  public void clik_login() {
	
	button.click();
		
		
	}


   //to get prices of all products in Sorted manner Low to High prices
   public void get_all_elements() throws InterruptedException {
	
	 
	List<String> textList = new ArrayList<>();     
	
    //fetching all the Prices of elements and Adding into List
    for(WebElement ele:elements_price_list) {
   //Storing prices into List<String>.	
	textList.add(ele.getText());         
	
	}

   //Sorting them into LOwest price to Highest price
   Collections.sort(textList, (s1, s2) -> {
    double value1 = Double.parseDouble(s1.substring(1));
    double value2 = Double.parseDouble(s2.substring(1));
    return Double.compare(value1, value2);
    });



     for(String txt: textList) {
	
	
	 System.out.println("Cost Price "+txt);           //Printing Prices which are stored into List
	
	
     }


	
}
}













