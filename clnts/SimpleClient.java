package clnts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		System.out.println("Enter remote IP n rem port no");
		try (Scanner sc = new Scanner(System.in); Socket s1 = new Socket(sc.next(), sc.nextInt())) {
			System.out.println("connected to " + s1.getInetAddress().getHostName() + " rem port " + s1.getPort()
					+ " local port " + s1.getLocalPort());
			// attach data strms
			try (DataOutputStream out = 
					new DataOutputStream(s1.getOutputStream());
					DataInputStream in = 
							new DataInputStream(s1.getInputStream());) {
				//send request
				out.writeUTF("Hello server ! how r u ?");
				//await resp
				System.out.println("srvr resp "+in.readUTF());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("clnt terminated.....");

	}

}
