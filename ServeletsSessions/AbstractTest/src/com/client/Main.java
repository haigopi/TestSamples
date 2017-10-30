package com.client;

import com.ibm.Add;
import com.infy.Compute;

public class Main {

	public static void main(String[] args) {
		
		Addition infy = new Compute();
		System.out.println(infy.add(2, 3));
		
		Addition ibm = new Add();
		System.out.println(ibm.add(2, 3));
		
	}
	
}
