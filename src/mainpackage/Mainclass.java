package mainpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {
	public static WebDriver obj;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// objects and variables instantiation
		
		Xls_AddParents excelcheck = new Xls_AddParents();
		excelcheck.ExcelView();
        
     /*  // WebDriver obj = new ChromeDriver();
        
		System.setProperty("webdriver.chrome.driver","F:\\Automation-Test\\Projects\\Drivers\\chromedriver.exe");
		 obj = new ChromeDriver();
    	obj.get("http://54.186.88.119:8090/");
    	obj.manage().window().maximize();
    	//launch the Chrome browser and open the application url
    	
    	obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       
    	
    	///////////// Test Case 1 :Login Verification test /////////////////
    	System.out.println("Here login credentail used to test login funtionality");	
	    // Login Credential use from excel
    	Login excellogin = new Login();
    	try {
			excellogin.logincredentails();
		
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
    		
     //////////////  Menu navigation testing  //////////////////////////////
	    Login navigationtest = new Login();
	   
	    navigationtest.Menunavigationcheck();
	    	
    	 ///////////// ADDING PARENT ////////////////
    	Parent addparent = new Parent();
    	 try{
    		 addparent.Addnewparent();
    		 
    	 }
    	 catch (IOException | InterruptedException e1) {
 			// TODO Auto-generated catch block
 			
 			e1.printStackTrace();
    	 }	
 			
 	///////////// Search & EDIT Parent ///////////////////////////
 			Parent Searchfunc = new Parent();
 	        Searchfunc.search();	
 	 		
 	    	Parent EditParentobj = new Parent();
 	    	EditParentobj.Editparent();
  	    	 
 	 	

 	 			
    ////////////////// Logout is Called begins ///////////////////////////////////
	    Logout logouttest =new Logout();
	    logouttest.logout();
	    System.out.println("System is log out - Ghar Jao!!");
	    Thread.sleep(10000);
	    
    
	 /////////////////////////////////////////////////////
	    */
	   
}
	
}


