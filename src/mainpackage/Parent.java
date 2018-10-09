package mainpackage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;



public class Parent extends Mainclass {
	
	public void Addnewparent()  throws InterruptedException, IOException{
		// ADDDING NEW Parent 
		
		obj.findElement(By.xpath("//*[contains(text(),'Parents')]")).click();
		obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/ul/li[3]/div")).click();		
		
		/// Adding field Values in Add Parent section
		obj.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Rohit Test");
		obj.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Automation");
		obj.findElement(By.xpath("//*[@name='Email']")).sendKeys("rohitautomation2@gmail.com");
		obj.findElement(By.xpath("//*[@id='Password']")).sendKeys("123456");
		obj.findElement(By.xpath("//*[@id='Phone']")).sendKeys("1234567890");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	    String Pagetitle =obj.getTitle();
	    if (Pagetitle.contentEquals("Parent Management"))
		{
	    	System.out.println("Adding new Parent  - PASSED");}
		else
		{
			System.out.println("Test Case 3 : Adding new Parent  - FAILED "); 
			
			
		}
	    
	
	   }	
		
		/*
	
		System.out.println("Here Adding new parent is done ");
		FileInputStream ExcelFile = new FileInputStream("F:\\Automation-Test\\Projects\\Test-data");
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFile); 
		XSSFSheet sheet = wb.getSheet("ParentSuite");
			
		
		for(int i=0;i<15;i++)
		{
		
			
			
			String uuid1 = RandomStringUtils.random(16, "0123456789abcdef"); 
			
			
			XSSFRow row = sheet.getRow(i);
		    String FirstName = row.getCell(0).getStringCellValue();
		    String LastName = row.getCell(1).getStringCellValue();
		    String EmailAddress = row.getCell(2).getStringCellValue();
		    String Password = row.getCell(2).getStringCellValue();
		    int Phone = (int) row.getCell(3).getNumericCellValue();
		    

		    Thread.sleep(2000);
		
			
		//Click on signup
		obj.findElement(By.xpath("//*[@id='System_efpc8hNa']/div/div[1]/div/div[2]/div/a")).click();

		obj.findElement(By.name("firstname")).sendKeys(FirstName);
		obj.findElement(By.name("lastname")).sendKeys(LastName);
		obj.findElement(By.name("email")).sendKeys(EmailAddress);
		obj.findElement(By.name("telephone")).sendKeys(""+Phone);
		obj.findElement(By.name("password")).sendKeys(""+Password);
		obj.findElement(By.name("confirm")).sendKeys(""+Password);
		
		
		Thread.sleep(5000);
		obj.findElement(By.xpath("//*[@id='System_6OjM9zPg']/form/div[2]/div[2]/input")).click();
		
		
		Thread.sleep(5000);
		//Click on BuySnacks 
		WebElement buysnacks=obj.findElement(By.xpath("//*[@id='menu_category_Menu_VIfWm2LT_461']/a/span/span"));
		JavascriptExecutor buysnacks1 = (JavascriptExecutor)obj;
		buysnacks1.executeScript("arguments[0].click()", buysnacks);
		
		Thread.sleep(2000);
		
		
		System.out.println("User Created Successfully :- "+EmailAddress);*/
		
	    public void search(){
		System.out.println("Here search cases are written");
		
		
		}


		
		public void Editparent() throws InterruptedException{
			
		System.out.println("Here Edit parent Test Case Starts");
		obj.findElement(By.xpath("//*[contains(text(),'Parents')]")).click();
		obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/ul/li[3]/div")).click();		
		
		/// Adding field Values in Add Parent section
		obj.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Rohit Test");
		obj.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Automation");
		obj.findElement(By.xpath("//*[@name='Email']")).sendKeys("rohitautomation2@gmail.com");
		obj.findElement(By.xpath("//*[@id='Password']")).sendKeys("123456");
		obj.findElement(By.xpath("//*[@id='Phone']")).sendKeys("1234567890");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	    String Pagetitle =obj.getTitle();
	    if (Pagetitle.contentEquals("Parent Management"))
		{
	    	System.out.println("Edit existing Parent is - PASSED");}
		else
		{
			System.out.println("Edit existing Parent is - FAILED"); 
			
			
		}
			
		}
		
		public void AssignStudents(){
		System.out.println("Here AssignStudents cases ar e written");	
		}
		
		
		
		public void advancesearch()
		{
		System.out.println("Here advancesearch cases are written");
		
	    }
	

}
