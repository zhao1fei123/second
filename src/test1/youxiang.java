package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youxiang {

	 
	public static void main(String[] args) throws InterruptedException {
		// 启动浏览器，进入163邮箱首页

	      WebDriver driver = new FirefoxDriver();
          driver.get("http://mail.163.com/");
		
		Thread.sleep(3000);
		 // 输入用户名密码，登录邮箱
		 WebElement youxiangzhanghao_element = driver.findElement(By.className("u-input box"));
		youxiangzhanghao_element.clear();
	    //邮箱用户名      
		youxiangzhanghao_element.sendKeys("15354188891");
		
		//邮箱密码     
	     WebElement mima_element = driver.findElement(By.className("j-inputtext dlpwd"));
	    mima_element.sendKeys("5451406.fly"); 
	    
		WebElement denglu_element = driver.findElement(By.id("dologin"));
		denglu_element.click();
	    
		Thread.sleep(10000);
		//  写信
		//WebElement xiexin_element = driver.findElement(By.id("_mail_component_82_82"));
		 WebElement xiexin_element = driver.findElement(By.xpath("//span[contains(.,'写 信')]"));
		 xiexin_element.click();
		//收件人
		 WebElement shoujianren_element = driver.findElement(By.className("js-component-emailcontainer nui-multiLineIpt C-multiLineIpt nui-ipt nui-ipt-hover"));
		 shoujianren_element.sendKeys("15354188891@163.com");
		//主题
		 WebElement zhuti_element = driver.findElement(By.className("js-component-input nui-ipt nui-ipt-hover"));
		 zhuti_element.sendKeys("test1");
		//邮件内容
		WebElement youjianneirong_element = driver.switchTo().frame(driver.findElement(By.className("APP-editor-iframe"))).findElement(By.className("nui-scroll"));
		youjianneirong_element.sendKeys("123456");
		 driver.switchTo().defaultContent();
		// 发送邮件
		 WebElement fasong_element = driver.findElement(By.xpath("//span[contains(.,'发 送')]"));
		 fasong_element.click();
		 
		 Thread.sleep(5000);
		 WebElement tuichu_element = driver.findElement(By.linkText("退出"));
		tuichu_element.click();
		
		driver.close();
	}

}
