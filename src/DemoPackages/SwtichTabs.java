package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwtichTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
				
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		
		Object[] HandleTabs = driver.getWindowHandles().toArray();
		driver.switchTo().window((String)HandleTabs[0]);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]")).sendKeys("mansithakkar1508@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"_R_1hmkqsqppb6amH1_\"]")).sendKeys("Hacker@1508");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();

	}

}