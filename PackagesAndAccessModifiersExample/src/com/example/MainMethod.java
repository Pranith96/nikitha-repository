package com.example;

import com.example1.Example2;

public class MainMethod extends Example2 {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.display();
		ex.hi();
		ex.print();
		
		MainMethod m = new MainMethod();
		m.hi1();
		m.print1();
	}
}
