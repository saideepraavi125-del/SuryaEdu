package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By unlocator=By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']");
	By pwdlocator= By.xpath("//input[@id='_R_1hmkqsqppb6amH1_']");
	By LoginLoctor=By.xpath("(//div[@class='x3nfvp2 x1n2onr6 xh8yej3'])[1]");
	
	public void login(String un,String pwd) {
		driver.findElement(unlocator).sendKeys(un);
		driver.findElement(pwdlocator).sendKeys(pwd);
		driver.findElement(LoginLoctor).click();
	}

}

