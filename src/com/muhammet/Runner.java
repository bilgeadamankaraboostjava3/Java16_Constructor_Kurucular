package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Nesne oluþmadan öncesi");
		Kedi kedi = new Kedi();
		
		System.out.println("Nesne oluþturulduktan sonrasý");			   
		System.out.println("Kedinin adý........: "+ kedi.ad);
		System.out.println("Kedinin boyu.......: "+ kedi.uzunluk);
		System.out.println("Kedinin agirligi...: "+ kedi.agirlik);
		System.out.println("Kedinin tüyü.......: "+ kedi.tuyrengi);
		
		//int s1 = sayi1();
		//int s2 = sayi2();

	}
	
	public static void sayi1() {
		
	}
	
	public static int sayi2() {
		return 4;
	}

}
