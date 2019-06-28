package com.phoenix.demos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("e:/reset.txt");
		try {
			int data=0;
			FileInputStream fin=new FileInputStream(f);
			BufferedInputStream bin=new BufferedInputStream(fin);
			String str=null;		
			while((data=bin.read())!=-1)
			{
			str	=Character.toString((char)data);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
