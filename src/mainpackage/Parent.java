package mainpackage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



@SuppressWarnings("unused")
public class Parent extends Mainclass {
	private String FName;
	private String LName;
	public void Addnewparent()  throws InterruptedException, IOException{
		// ADDDING NEW Parent 
		
		obj.findElement(By.xpath("//*[contains(text(),'Parents')]")).click();
		obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/ul/li[3]/div")).click();		
		
		/// Adding field Values in Add Parent section
		obj.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Rohit");
		 this.FName= obj.findElement(By.xpath("//*[@name='FirstName']")).getAttribute("value");
		 System.out.println(FName);
		 obj.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Automation");
		 this.LName = obj.findElement(By.xpath("//*[@name='LastName']")).getAttribute("value");
		obj.findElement(By.xpath("//*[@name='Email']")).sendKeys("rohitautomation10@gmail.com");
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
	
		System.out.println("Here Edit parent Test Case Starts");
		obj.findElement(By.xpath("//*[contains(text(),'Parents')]")).click();
		obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.findElement(By.xpath("//*[@id='search-input']")).sendKeys(this.FName+" "+this.LName);	
		System.out.println(this.FName+" "+this.LName);
		obj.findElement(By.xpath("//*[@type='button']")).click();
		obj.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
		}


		
		public void Editparent() throws InterruptedException{
		
		/// Selecting parent from grid : To edit parent fields  
		obj.findElement(By.xpath("//*[@id='grid']/table/tbody/tr[1]/td[4]/div[1]/a[2]/i")).click();	
		
		
		/// Adding field Values in Add Parent section
		obj.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Rohit Test Edited");
		obj.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Automation");
	

		obj.findElement(By.xpath("//*[@id='Phone']")).sendKeys("0123456789");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	    String Pagetitle =obj.getTitle();
	    if (Pagetitle.contentEquals("Parent Management"))
		{
	    	System.out.println("Edit Parent test case is - PASSED");}
		else
		{
			System.out.println("Edit Parent test case is - FAILED"); 
			
			
		}
			
		}
		
		public void AssignStudents(){
		System.out.println("Here AssignStudents cases are written");	
		}
		
		
		
		public void advancesearch()
		{
		System.out.println("Here advance search cases are written");
		
	    }
	

}
