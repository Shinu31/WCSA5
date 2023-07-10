package TaskAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class bluestone {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwqNqkBhDlARIsAFaxvwwvVvXoWwEHKbxu3TjokZcUQl4PypvOGq1EESpuxOsbiX6GMeLvC3YaAj1eEALw_wcB");
	 driver.findElement(By.id("denyBtn")).click();  
	 
	WebElement offers= driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']")).click();
	

}}