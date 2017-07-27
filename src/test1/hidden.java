package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden {


	public static void main(String[] args) throws InterruptedException {
		 String URL="E:\\2.html";
	 
	         WebDriver driver = new  FirefoxDriver();
	         driver.manage().window().maximize();
	 
	        driver.get(URL);
	      
	        //run JS to modify hidden element 
	        ((JavascriptExecutor)driver).executeScript("document.getElementById(\"em\").type ='text';");
	        Thread.sleep(3000);
	        //run JS and add a alert
	
	 //     ((JavascriptExecutor)driver).executeScript("alert(\"hello,this is a alert!\");value=\"Alert\"");
	     
	//        Thread.sleep(3000);
	          //create a alert instance
	//          Alert alert1=driver.switchTo().alert();
	          //print alert text
	//          System.out.println(alert1.getText());
	           //click accept button
	//          alert1.accept();
	             //create elements
	            WebElement we=driver.findElement(By.id("fn"));
	            WebElement su=driver.findElement(By.id("su"));
	             WebElement em=driver.findElement(By.id("em"));
	             // input something 
	           we.sendKeys("username test");
	           
	            Thread.sleep(3000);
	            //print email tagname
	            System.out.print("Email  isDislayed="+em.isDisplayed()+"\n");
	            Thread.sleep(3000);
	             //click submit button
	             su.click();
	            Thread.sleep(3000);
	             Alert alert=driver.switchTo().alert();
	            System.out.print( alert.getText());
	             alert.accept();
	            Thread.sleep(3000); 
	            
	             driver.quit();
	}

}
