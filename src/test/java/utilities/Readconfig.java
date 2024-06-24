package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

    public class Readconfig {
	Properties pro;
	public Readconfig() {
		
		
		  File src = new File("./Configurations/config.properties");
		  
		  try{
		   FileInputStream fi = new FileInputStream(src);
		
			 pro= new Properties();
			 pro.load(fi);
			
		    } 
		    catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		
		   }
 }
				 
		                    
		                      
		//fetching URL value from Property file
		public String get_url() {
			
			String url = pro.getProperty("url");
			
			return url;
		 }
		
		 //fetching Username value from Property file
         public String get_username() {
			
			String un = pro.getProperty("user_name");
			
			return un;
		 }
         
          //fetching Password value from Property file
          public String get_password() {
 	
	      String pw = pro.getProperty("user_passd");
	
	       return pw;
	       
         }
		
		
		
		
		
		
		
	}	
	
	
	

