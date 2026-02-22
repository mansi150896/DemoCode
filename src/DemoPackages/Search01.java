package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ArtOfTesting");
		driver.findElement(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li[1]/div")).click();
		driver.close();

	}

}