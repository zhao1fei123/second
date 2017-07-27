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
		driver.findElement(By.linkText("��Ʊ")).click();
		Thread.sleep(2000);
		
		//�õ���ǰ���ڵľ��
		String CurrentWindow=driver.getWindowHandle();
		//�õ����д��ڵľ��
	    Set<String> handles=driver.getWindowHandles();	
		//��������ǰ����
		handles.remove(CurrentWindow);
		//�ж��Ƿ���ڴ���
		System.out.print(handles.size());		
		if(handles.size()>0){			
			try{		
		//��λ����		
		driver.switchTo().window(handles.iterator().next());		
		}catch(Exception e){		
		System.out.print(e.getMessage());
		}
		}	
	
    //	driver.findElement(By.id("login_user")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'��¼')]")).click();				
		//driver.findElement(By.xpath(".//*[@id='login_user']")).click();	
		
		//driver.findElement(By.id("username")).sendKeys("zhao1fei123");
		//driver.findElement(By.id("password")).sendKeys("fei18713529873");		
		//Thread.sleep(30000);		
		//driver.findElement(By.id("loginSub")).click();			
		
		//�����ƱԤ��
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("��ƱԤ��")).click();
		
		Thread.sleep(1000);
		//��������
		driver.findElement(By.id("fromStationText")).clear();
		//��������أ�����    �޸���������display
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('form_cities').style.display='block';");
        
		
    	driver.findElement(By.id("fromStationText")).sendKeys("����");
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.RETURN );
		
		//����Ŀ�ĵأ�
		driver.findElement(By.id("toStationText")).clear();	
		
		String js2 = "document.getElementById('form_cities').style.display='block';";
        ((JavascriptExecutor)driver).executeScript(js2);
      
        driver.findElement(By.id("toStationText")).sendKeys("����");       		
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.ARROW_DOWN);
		((HasInputDevices)driver).getKeyboard().sendKeys(Keys.RETURN );
		
		//��������1  remove readonly attribute
		  JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  

	         removeAttribute.executeScript("var setDate=document.getElementById(\"train_date\");setDate.removeAttribute('readonly');") ;
	         WebElement setDatElement=driver.findElement(By.xpath("//input[@id='train_date']"));
	         setDatElement.clear();
	         setDatElement.sendKeys("2017-06-11");
	         WebElement dayElement=driver.findElement(By.className("so"));
	         dayElement.click();
	
    
		
		//�����ѯ��ť
		driver.findElement(By.id("query_ticket")).click();
		
		
		//ˢ��
	//	((HasInputDevices)driver).getKeyboard().sendKeys(Keys.F5);
		
		

	}

}
