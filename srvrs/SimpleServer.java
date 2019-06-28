package srvrs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import static javax.swing.JOptionPane.*;

public class SimpleServer {

	public static void main(String[] args) {
		System.out.println("waiting for clnt....");
		try (ServerSocket ss = new ServerSocket(3000, 1);
				// accept cn
				Socket ds = ss.accept();) {
			System.out.println(
					"Accepted cn from clnt " 
			+ ds.getInetAddress().getHostName() 
			+ " remote port " + ds.getPort());
			try (DataOutputStream out =
					new DataOutputStream
					(ds.getOutputStream());
					DataInputStream in = 
							new DataInputStream
							(ds.getInputStream())) {
				//read request
			//	System.out.println("clnt req : "+in.readUTF());
				showMessageDialog(null,in.readUTF());
				//send resp
				out.writeUTF("Hello clnt ! I am good!");
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
