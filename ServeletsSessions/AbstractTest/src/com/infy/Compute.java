package com.infy;

import com.client.Addition;

public class Compute extends Addition{

	@Override
	public int add(int a, int b) {
	
		return a - a + b + a;
	}
}
