package utility;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import Base.BaseClass;

public class GenericUtility extends BaseClass {
	public GenericUtility(WebDriver driver) {
		this.driver=driver;
	}
	public void screenshot(String text) throws IOException {
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Windows 10pro\\Desktop\\Seliminum\\"+text+".png");
	    Files.copy(src, dst);
	
		
	}

}
