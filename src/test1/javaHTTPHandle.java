package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class javaHTTPHandle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		javaHTTPHandle jhh=new javaHTTPHandle();
		//jhh.sendGet("http://www.baidu.com");
		jhh.sendPost("urlAddress"," paramVale");
		
	}
	//�������Ӳ���������
	public void sendGet(String urlAddress){
		try{
		HttpURLConnection urlConnection=null;
		URL url=new URL(urlAddress);
		urlConnection=(HttpURLConnection)url.openConnection();
		urlConnection.setDoInput(true);
		urlConnection.setUseCaches(false);
		urlConnection.connect();
		
		
		
		//��ȡ��Ӧ������
		BufferedReader bf=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
		String line=bf.readLine();
		while(line!=null){
		System.out.println(line);
		line=bf.readLine();
		}
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
	public void sendPost(String urlAddress,String paramVale){
		try{
		HttpURLConnection urlConnection=null;
		URL url=new URL(urlAddress);
		urlConnection=(HttpURLConnection)url.openConnection();
		urlConnection.setUseCaches(false);
		urlConnection.connect();
		
		PrintWriter pw=new PrintWriter(urlConnection.getOutputStream());		
		pw.print(paramVale);
		pw.flush();
		
		//��ȡ��Ӧ������
		BufferedReader bf=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
		String line=bf.readLine();
		while(line!=null){
		System.out.println(line);
		line=bf.readLine();
		}
	}catch(Exception e){
		e.printStackTrace();
		
	}
}
}