package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ticket1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.get("https://kyfw.12306.cn/otn/index/init");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 
        
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         
         //出发地
         WebElement fromStation=driver.findElement(By.xpath("//input[@id='fromStationText']"));
         fromStation.click();
         fromStation.sendKeys("郑州");
         WebElement choseFrom =driver.findElement(By.xpath("//div/span[@class='ralign' and text()='郑州']"));
         choseFrom.click();
         //目的地
         WebElement toStation=driver.findElement(By.xpath("//input[@id='toStationText']"));
         toStation.click();
         toStation.sendKeys("上海");
         WebElement choseElement =driver.findElement(By.xpath("//div/span[@class='ralign' and text()='上海']"));
         choseElement.click();
         JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
         //remove readonly attribute
         removeAttribute.executeScript("var setDate=document.getElementById(\"train_date\");setDate.removeAttribute('readonly');") ;
         WebElement setDatElement=driver.findElement(By.xpath("//input[@id='train_date']"));
         setDatElement.clear();
         setDatElement.sendKeys("2017-08-15");
   
         WebElement dayElement=driver.findElement(By.className("so"));
         dayElement.click();
       
         WebElement searchElement=driver.findElement(By.xpath("//div/a[@id='a_search_ticket']"));
         searchElement.click();
         
         driver.quit();
	}

}
