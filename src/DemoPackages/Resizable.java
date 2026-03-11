package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        
        Actions resize = new Actions(driver);
        WebElement drag = driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        resize.clickAndHold(drag).moveToLocation(500, 500).release().perform();

	}

}
