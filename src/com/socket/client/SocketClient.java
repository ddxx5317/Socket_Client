package com.socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//����socket����
		Socket socket = new Socket("127.0.0.1",12345);

		// �õ����������������
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		String cityName = "�Ϻ�";
		output.writeUTF(cityName);
		System.out.println("send to server:"+cityName);
		
		// �õ�����������������
		DataInputStream input = new DataInputStream(socket.getInputStream());
		String result = input.readUTF();
		System.out.println("from server reslult:"+result);
	}
}
