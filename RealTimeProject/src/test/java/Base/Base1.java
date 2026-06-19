package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base1 {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) 
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println(("not found"));
		}

}
}