package com.phoenix.demos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class  deserializable // for deserialization
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin = new FileInputStream("serialize.txt");
			ObjectInputStream oin =new ObjectInputStream(fin);

			DemoSerial obj= new DemoSerial();
		
			obj=(DemoSerial)oin.readObject();
			obj.printData();
		/*	System.out.println(obj);
		
			obj=(DemoSerial)oin.readObject();
			obj.printData();
			System.out.println(obj);

			System.out.println((DemoSerial)oin.readObject());

			
			System.out.println("Object is Read");*/
			oin.close();
		}
		catch(Exception e)
		{ }

	}
}