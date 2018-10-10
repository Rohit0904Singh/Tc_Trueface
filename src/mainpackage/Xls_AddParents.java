package mainpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class Xls_AddParents {
	static String modulenm;
	static Xls_Reader modulexls;
	static Xls_Reader obj1;
	static String testcasenm;
	static String keywordnm;
	
public void ExcelView() throws IOException{
	
	//I have placed an excel file 'Test.xlsx' in my D Driver 
	obj1 = new Xls_Reader("F:\\Automation-Test\\Projects\\Test-data\\ExcelData.xlsx");

     System.out.println("Row count "+obj1.getRowCount("LoginSuite"));

     System.out.println("Column count "+obj1.getColumnCount("LoginSuite"));
     for(int i=2;i<=obj1.getRowCount("Test Suite");i++) {
			if(obj1.getCellData("Test Suite", "Runmode", i).equals("Y")) {
				modulenm=obj1.getCellData("Test Suite", "TSID", i);
				
				modulexls=new Xls_Reader("D:\\Selenium_Learn\\Workspace2\\ReadXcelData\\src\\XlsFile\\"+modulenm+".xlsx");
				
				// Read Module File
				for(int j=2;j<=modulexls.getRowCount("Test Cases");j++) {
					if(modulexls.getCellData("Test Cases", "Runmode", j).equals("Y")) {
						testcasenm=modulexls.getCellData("Test Cases", "TCID", j);
						//System.out.println("Test Case to be executed "+testcasenm);
						
						
						// Read Test Steps
						for(int x=2;x<=modulexls.getRowCount("Test Steps");x++) {
							if(modulexls.getCellData("Test Steps", "TCID", x).equals(testcasenm)) {
								keywordnm=modulexls.getCellData("Test Steps", "Keyword", x);
								System.out.println(keywordnm);
								modulexls.setCellData("Test Steps", "Result", x, "Pass");
	


}
}
