package com.test;

class Poduct {
	int x;
	int y;
	public Poduct(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void call() {
		System.out.println("call method called");
	}
}
public class Test14 {
	public static void main (String[] args) {
		Poduct p = new Poduct(5,6);
		p.call();
	}
}
