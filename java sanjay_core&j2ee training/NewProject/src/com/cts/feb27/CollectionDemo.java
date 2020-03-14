package com.cts.feb27;

import java.io.IOException;
import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) throws IOException {

		ArrayList<Integer> arrli = new ArrayList<Integer>();
		ArrayList<Integer> arrli2 = new ArrayList<Integer>();

		arrli.add(20);
		arrli.add(40);
		arrli.add(35);
		arrli.add(80);
		arrli.add(32);

		System.out.println(arrli);

// Printing elements one by one 

		for (int i = 0; i < arrli.size(); i++) {
			if (arrli.get(i) % 2 == 0 && arrli.get(i) % 5 == 0)
				arrli2.add(arrli.get(i));
		}
		System.out.println(arrli2);
	}

}
