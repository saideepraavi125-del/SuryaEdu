package testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Base1;
import Base.BaseClass;
import pages.LoginPage;
import utility.ExcelUtility;
import utility.GenericUtility;

public class TS1 extends Base1{
	@Test(dataProvider = "a")
	public void TC_01(String un, String Pwd) throws IOException {
		driver.get("https://facebook.com");
		LoginPage lp=new LoginPage(driver);
		lp.login(un, Pwd);
		//GenericUtility gu=new GenericUtility(driver);
		//gu.screenshot("photo1");
		
	}
	
	@Test(enabled=false)
	public void Tc_02() throws IOException{
		LoginPage lp=new LoginPage(driver);
	lp.login("8186050400", "deepu24061999");
		GenericUtility gu=new GenericUtility(driver);
		gu.screenshot("photo2");
		
		
	}

	
	@DataProvider(name="a")
	public String [][] getData() throws IOException {
		ExcelUtility eu= new ExcelUtility("C:\\Users\\Windows 10pro\\Documents\\Book1.xlsx");
		int rows=eu.getRows("Sheet2");
		int cols=eu.getcols("Sheet2", 1);
		String[][] val=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				val[i-1][j]=eu.getalue("Sheet2", i, j);
			}
		}
		
		return val;
		
		
		
	}

}
