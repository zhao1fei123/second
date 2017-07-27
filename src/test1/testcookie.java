package test1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcookie {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr =new FirefoxDriver();
		String url = "http://www.baidu.com";
		System.out.printf("now accesss %s \n", url);

		dr.get(url);
		
	    Thread.sleep(2000);

		System.out.println(dr.manage().getCookies());

		dr.manage().deleteAllCookies();

		Cookie c1 = new Cookie("BAIDUID", "B3C881A40CB7C83F0F7AFE45A99066CC:FG=1");
		Cookie c2 = new Cookie("BDUSS", "2thZy1hTTVmNnhVOHRIcVVXb1NDSGR2RWdUSEllcnFyQTlYempiZVZWR0w3cFJaSVFBQUFBJCQAAAAAAAAAAAEAAABuPXkmt-e617vqvqo1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIthbVmLYW1ZR");
		dr.manage().addCookie(c1);
		dr.manage().addCookie(c2);

		
		dr.navigate().refresh();
		
		dr.quit();
	}

}
