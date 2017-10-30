package com.ibm;

import com.client.Addition;

public class Add extends Addition{

	@Override
	public int add(int a, int b) {
		
		return a + b - b + b;
	}

	
	
}
