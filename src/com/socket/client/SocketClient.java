package com.socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//创建socket连接
		Socket socket = new Socket("127.0.0.1",12345);

		// 得到输出流，发送数据
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		String cityName = "上海";
		output.writeUTF(cityName);
		System.out.println("send to server:"+cityName);
		
		// 得到输入流，接收数据
		DataInputStream input = new DataInputStream(socket.getInputStream());
		String result = input.readUTF();
		System.out.println("from server reslult:"+result);
	}
}
