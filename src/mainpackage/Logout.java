package mainpackage;

import org.openqa.selenium.By;


public class Logout extends Login {
	
// Here this Method define to logout from the system
public void logout() throws InterruptedException{
String Pagetitle =obj.getTitle();	
System.out.println("system Logout action");

if (Pagetitle.contains("Dashboard"))
    {
	
	
	
	obj.findElement(By.xpath("//*[@class='fa fa-caret-down']")).click();
	Thread.sleep(5000);
	obj.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
	Thread.sleep(5000);
	System.out.println("system Logout Proceed");
	
    }
	
    else
    {
	System.out.println("Log out is cannot be possible if user is not logged in");
	
    }
}
}