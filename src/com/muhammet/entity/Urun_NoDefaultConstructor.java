package com.muhammet.entity;

import java.util.Random;

public class Urun_NoDefaultConstructor {
	/**
	 * DÝKKAT!!
	 * Default Constructor bir sýnýfýn doðal üyesidir. ancak eðer özellþtirilmiþ bir 
	 * constructor var ve default constructor elle girilmemiþ ise default constructor
	 * çalýþmaz.
	 */
	public long id;
	public String ad;
	public String barkod;
	public double fiyat;
	public boolean state;
	
	public Urun_NoDefaultConstructor(String uad,String ubarkod, double ufiyat) {
		id = new Random().nextLong();
		ad = uad;
		fiyat = ufiyat;
		barkod = ubarkod;
		state = true;
	}
	

}
