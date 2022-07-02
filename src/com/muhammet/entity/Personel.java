package com.muhammet.entity;

public class Personel {

	
	public String ad;
	public String adres;
	public String telefon;
	public int dogumyili ;
	//Default
	public Personel() {
		
	}
	// PArametreli Constructor
	public Personel(String padi, String padresi, String ptelefonu, int pdogumyili) {
		ad = padi;
		adres = padresi;
		telefon = ptelefonu;
		dogumyili = pdogumyili;
	}
	
}
