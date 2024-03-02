package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Methods {
	 public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://rvrjcce.ac.in/");
	        System.out.println(driver.getTitle());
	        Thread.sleep(500);
	        
	        // Navigate to other web site
	        driver.navigate().to("http://courses.rvrjc.ac.in/");
	        System.out.println(driver.getTitle());
	        
	       // To maximize the window
	        driver.manage().window().maximize();
	        Thread.sleep(500);
	        
	        // to refresh the web page
	        driver.navigate().refresh();
	        System.out.println(driver.getTitle());
	        
	        
	 }

}
