package test1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FeiQiu {

	 
	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<30;i++){
		//飞秋报文规则

        // String content="1_lbt4_10#32899#002481627512#0#0#0:1289671407:Adminstrator:MICROSO-697TGLD:288:这是一个测试消息。";
         String content="1:100:尚轩:LAPTOP-VCV6RKQ8:32:闲的蛋疼";
		//java发送UDP
		
		byte[] sendBuf=content.getBytes("GBK");
		
		DatagramSocket client = new DatagramSocket();  
		InetAddress addr =InetAddress.getByName("172.36.1.118");  
        int port =2425;
        DatagramPacket packet = new DatagramPacket(sendBuf,sendBuf.length,addr,port);  

        client.send(packet);
     // client.close();
        
		
	}
	}
}
