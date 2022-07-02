package com.muhammet.entity;

public class Kedi {
	
	public String tur;
	public String ad;
	public int uzunluk;
	public int agirlik;
	public String tuyrengi;
	public int kuyrukuzunlugu;

	/**
	 * Constructor -> Yapýcý ya da Kurucu method
	 * Taným -> 
	 *  - (Return Type)geri dönüþ tipi yoktur. belirtilmez. 
	 *  - sýnýf adý ile constructor method adý ayný olmak zorundadýr.
	 *  - dýþarýdan deðer alabilir ya da deðer almada tanýmlanabilir.
	 *  - özel bir Builder iþlemi yok ise, eriþim belirteci public olmalýdýr.
	 */
	// Default Constructor
	// siz yazmasanýz dahi her sýnýfta o sýnýftn nesne yaratan kurucu method vardýr.
	// Geri dönüþ tipi yoktur  != constructor deðer döndürmez
	// Constructor-> bir nesne oluþturur ve nesnenin referansýný döner.
	public Kedi() {
		uzunluk = 21;
		agirlik = 120;
		tuyrengi = "gri";
		kuyrukuzunlugu = 8;
		System.out.println("Kedinin constructor' ý çalýþtý");
	}
	
	
}
