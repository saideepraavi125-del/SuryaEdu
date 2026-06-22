package real2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']")).sendKeys("8186050400");
		driver.findElement(By.xpath("//input[@id='_R_1hmkqsqppb6amH1_']")).sendKeys("deepu24061999");
		driver.findElement(By.xpath("(//div[@class='x3nfvp2 x1n2onr6 xh8yej3'])[1]")).click();
		
	}
	

}
