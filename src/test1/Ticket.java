package test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;


public class Ticket {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.12306.cn");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("购票")).click();
		Thread.sleep(2000);
		
		//得到当前窗口的句柄
		String CurrentWindow=driver.getWindowHandle();
		//得到所有窗口的句柄
	    Set<String> handles=driver.getWindowHandles();	
		//不包括当前窗口
		handles.remove(CurrentWindow);
		//判断是否存在窗口
		System.out.print(handles.size());		
		if(handles.size()>0){			
			try{		
		//定位窗口		
		driver.switchTo().window(handles.iterator().next());		
		}catch(Exception e){		
		System.out.print(e.getMessage());
		}
		}	
	
    //	driver.findElement(By.id("login_user")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'登录')]")).click();				
		//driver.findElement(By.xpath(".//*[@id='login_user']")).click();	
		
		//driver.findElement(By.id("username")).sendKeys("zhao1fei123");
		//driver.findElement(By.id("password")).sendKeys("fei18713529873");		
		//Thread.sleep(30000);		
		//driver.findElement(By.id("loginSub")).click();			
		
		//电击车票预订
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("车票预订")).click();
		
		Thread.sleep(1000);
		//清空输入框
		driver.findElement(By.id("fromStationText")).clear();
		//输入出发地，北京    修改隐藏属性display
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('form_cities').style.display='block';");
        
		
    	driver.findElement(By.id("fromStationText")).sendKeys("北京");
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.RETURN );
		
		//输入目的地，
		driver.findElement(By.id("toStationText")).clear();	
		
		String js2 = "document.getElementById('form_cities').style.display='block';";
        ((JavascriptExecutor)driver).executeScript(js2);
      
        driver.findElement(By.id("toStationText")).sendKeys("沈阳");       		
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.RETURN );
		
		//出发日期1  remove readonly attribute
		  JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  

	         removeAttribute.executeScript("var setDate=document.getElementById(\"train_date\");setDate.removeAttribute('readonly');") ;
	         WebElement setDatElement=driver.findElement(By.xpath("//input[@id='train_date']"));
	         setDatElement.clear();
	         setDatElement.sendKeys("2017-06-11");
	         WebElement dayElement=driver.findElement(By.className("so"));
	         dayElement.click();
	
    
		
		//点击查询按钮
		driver.findElement(By.id("query_ticket")).click();
		
		
		//刷新
	//	((HasInputDevices)driver).getKeyboard().sendKeys(Keys.F5);
		
		

	}

}
