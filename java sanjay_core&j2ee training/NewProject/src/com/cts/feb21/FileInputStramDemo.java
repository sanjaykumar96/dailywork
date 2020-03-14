package com.cts.feb21;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileInputStramDemo {
public static void main(String[] args) throws FileNotFoundException,IOException{
	String path="C:\\Users\\seed\\Desktop\\outputstram\\data.txt";
	String newpath="C:\\Users\\seed\\Desktop\\outputstram\\copy.txt";
	File file=new File(path);
	FileInputStream in =new FileInputStream(file);
	BufferedInputStream bin=new BufferedInputStream(in);
	FileOutputStream out=new FileOutputStream(newpath);
	BufferedOutputStream bout= new BufferedOutputStream(out);
	int i;
	//while((i=in.read())!=-1) {                         //replace in by bin
	//	System.out.print((char)i);
	//}
	while((i=in.read())!=-1) {
		out.write(i);
	}
	
	bout.close();
}
}
