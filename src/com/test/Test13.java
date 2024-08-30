package com.test;

class Product {
	public int num;
	public void call(Product ref) {
		ref.num++;
	}
}
public class Test13 {
	public static void main (String[] args) {
		Product p = new Product();
		p.num = 1;
		p.call(p);
		System.out.println(p.num);
	}
}
