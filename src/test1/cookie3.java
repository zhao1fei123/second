package test1;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookie3 {


	public static void main(String[] args) throws InterruptedException {

				
		WebDriver dr =new FirefoxDriver();
		String url = "http://172.36.1.21:3570/default/coframe/auth/skin1/index.jsp";
		
		dr.get(url);
		
	    Thread.sleep(2000);

		System.out.println(dr.manage().getCookies());

		dr.manage().deleteAllCookies();

		Cookie c1 = new Cookie("ADMINCONSOLESESSION", "gv26ZxlYmwfz2yfy4kfsJ2JBnmCThvWvR1rjW1Lnxh98lQ47NQmh!1577096884");
		Cookie c2 = new Cookie("JSESSIONID", "03hpZxmbrzvJrGHhmKXhk2yVXL4VZlVH9w6LBtW160QkJm2DXLpy!848324185");
		Cookie c3 = new Cookie("JSESSIONID", "337A6FC2B2DB1750535145FEF3D89907");

		dr.manage().addCookie(c1);
		dr.manage().addCookie(c2);
		dr.manage().addCookie(c3);

		
		dr.navigate().refresh();
		
		dr.quit();
		

	}

}
