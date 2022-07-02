package com.muhammet.entity;

import java.util.Random;

public class Urun_NoDefaultConstructor {
	/**
	 * D�KKAT!!
	 * Default Constructor bir s�n�f�n do�al �yesidir. ancak e�er �zell�tirilmi� bir 
	 * constructor var ve default constructor elle girilmemi� ise default constructor
	 * �al��maz.
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
