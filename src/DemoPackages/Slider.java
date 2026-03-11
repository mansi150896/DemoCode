package DemoPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");

        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        Actions move = new Actions(driver);
        WebElement from = driver.findElement(By.id("slider"));
        move.dragAndDropBy(from, 300, 100).perform();

	}

}