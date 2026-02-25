package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitlePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/link.html");
		
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		String pagetitle = driver.getTitle();
		System.out.println("The title of this page is: " + pagetitle);
		
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		String pagetitle1 = driver.getTitle();
		System.out.println("The title of this page is: " + pagetitle1);
		
		driver.close();
		

	}

}
