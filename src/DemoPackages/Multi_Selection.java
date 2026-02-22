package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByValue("apple");
		fruits.selectByValue("grape");
		Thread.sleep(5000);
		fruits.deselectAll();
		driver.close();
		
	}

}
