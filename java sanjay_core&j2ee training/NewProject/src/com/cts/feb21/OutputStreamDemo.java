package com.cts.feb21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		String path="C:\\Users\\seed\\Desktop\\outputstram\\data.txt";
		FileOutputStream out=new FileOutputStream(path,true);
		String message="the joining date was 28 january";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
		
		
		
	}

}
