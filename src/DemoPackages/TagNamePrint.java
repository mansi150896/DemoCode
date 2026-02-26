package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamePrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        System.out.println(element.getTagName());
        
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        System.out.println(element1.getTagName());
        
        driver.close();

	}

}
