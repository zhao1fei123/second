package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {


	public static void main(String[] args) {
		 //�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��13      
		 //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe"); 
		 WebDriver driver = new FirefoxDriver();		 
		 
		//IE�����		
		// System.setProperty("webdriver.ie.driver", "C:/Program Files (x86)/Internet Explorer/iexplore.exe");
		 //WebDriver driver=new InternetExplorerDriver();

		 //�ȸ������
		 // System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
	     // WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://www.baidu.com/");
		 WebElement txtbox = driver.findElement(By.name("wd"));
		 txtbox.sendKeys("Glen");
		 WebElement btn = driver.findElement(By.id("su"));
		 btn.click();
		 //driver.close();
	}

}
