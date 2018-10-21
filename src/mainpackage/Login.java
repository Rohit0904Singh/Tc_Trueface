package mainpackage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Login extends Mainclass {
	
	
	public void logincredentails() throws IOException, InterruptedException{
	
	////////// Login Via Excel /////////////////////////////////////
	
   
  try{
	 obj.findElement(By.xpath("//*[@id='Email']")).sendKeys("johndoe@gmail.com");

	obj.findElement(By.xpath("//*[@id='Password']")).sendKeys("1234");
	Thread.sleep(5000);
	obj.findElement(By.xpath("//input[@type='submit']")).click();
	
	
   /// Checking is login is done successfully 
	String Pagetitle =obj.getTitle();
	System.out.println("Here is Title page name " +Pagetitle);
	if (Pagetitle.contentEquals("Dashboard"))
	{System.out.println("User logged In Successfully :- ");}
	else
	{System.out.println("Login Credentail is invalid:- "); }
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
  

	
	
	
	public void Menunavigationcheck()
	{
	obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("Checking User access Type from Navigation Menu's ");
	
	try{
		
		if(obj.getPageSource().contains("Teachers"))
		{
			if(obj.getPageSource().contains("Students")){
				if(obj.getPageSource().contains("Students")){
				System.out.println("Login with SAdmin "); 
				}
				}
		}
		if(obj.getPageSource().contains("Students")){
			System.out.println("Login with Teacher Credentails "); 	
		}

		else
		{
			System.out.println("Login with Invalid Credentails ! Please check "); 	
		}
	}
		
    catch(Exception e)
    {
    	 System.out.println(e);}
		
    }
    
}




