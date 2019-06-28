package com.phoenix.demos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class SerializableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		{
			try
			{
			DemoSerial obj1 = new DemoSerial(100,"abc");
			DemoSerial obj2 = new DemoSerial(101,"xyz");

			FileOutputStream fout = new FileOutputStream("serialize.txt");
			ObjectOutputStream oos =new ObjectOutputStream(fout);
			oos.writeObject(obj1);
			oos.writeObject(obj2);
			oos.flush();
			oos.close();
			System.out.println("Object is Written to File demoobj");
		}

		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
}
}
