package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimeSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement date = driver.findElement(By.name("bdaytime"));
		date.sendKeys(Keys.TAB);
		date.sendKeys("1996-08-15");
		date.sendKeys(Keys.TAB);
		date.sendKeys("20:10");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
        String Message = driver.findElement(By.xpath("/html/body/div[2]")).getText();
        System.out.println(Message);
	}

}
