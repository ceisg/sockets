package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ; 
		
		try {
			Socket client = new Socket("127.0.0.1",2022);
			
									
			
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream()) ; 
			
			
			System.out.println( in.readUTF());
			
            out.writeInt(sc.nextInt());

            System.out.println( in.readUTF());
			
			client.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
