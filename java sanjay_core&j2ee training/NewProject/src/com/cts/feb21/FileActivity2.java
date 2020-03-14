package com.cts.feb21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActivity2 {
	public static void main(String[] args) throws IOException  {
		Scanner src = new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("\n"+"Press 1 to enter book details.\nPress 2 to display book details."
					+ "\nPress 3 to exit.");
			System.out.print("Enter your choice: ");
			choice = src.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3: System.exit(0);
			}
		}while (choice != 3);
		
		String path="C:\\Users\\seed\\Desktop\\outputstram\\write.txt";
		FileWriter out=new FileWriter(path);
		String msg="file write data";
		String bookname="c++";
		String authorname="yashwant";
		String price="300";
		out.write(bookname+"\t"+authorname+"\t"+price);
		out.close();
		
	}
	
	
	}


