package serveur;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {


		try {
			ServerSocket ss = new ServerSocket(2022);
			
			System.out.println("Serveur : attente de connexion ....");
			Socket serveur = ss.accept() ;
			System.out.println("Un client se connecte");
			
			DataInputStream in = new DataInputStream(serveur.getInputStream());
			DataOutputStream out = new DataOutputStream(serveur.getOutputStream()) ; 
			
			out.writeUTF("Donner un entier : ");
			int x = in.readInt();
			
			if (x%2==0)
				out.writeUTF(x+" est pair");
			else
				out.writeUTF(x+" est impair");
			
			serveur.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
