package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		 Actions move = new Actions(driver);
         WebElement from = driver.findElement(By.id("draggable"));
         WebElement to = driver.findElement(By.id("droppable"));
         
         move.dragAndDrop(from, to).perform();	

	}

}
