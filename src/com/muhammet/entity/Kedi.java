package com.muhammet.entity;

public class Kedi {
	
	public String tur;
	public String ad;
	public int uzunluk;
	public int agirlik;
	public String tuyrengi;
	public int kuyrukuzunlugu;

	/**
	 * Constructor -> Yap�c� ya da Kurucu method
	 * Tan�m -> 
	 *  - (Return Type)geri d�n�� tipi yoktur. belirtilmez. 
	 *  - s�n�f ad� ile constructor method ad� ayn� olmak zorundad�r.
	 *  - d��ar�dan de�er alabilir ya da de�er almada tan�mlanabilir.
	 *  - �zel bir Builder i�lemi yok ise, eri�im belirteci public olmal�d�r.
	 */
	// Default Constructor
	// siz yazmasan�z dahi her s�n�fta o s�n�ftn nesne yaratan kurucu method vard�r.
	// Geri d�n�� tipi yoktur  != constructor de�er d�nd�rmez
	// Constructor-> bir nesne olu�turur ve nesnenin referans�n� d�ner.
	public Kedi() {
		uzunluk = 21;
		agirlik = 120;
		tuyrengi = "gri";
		kuyrukuzunlugu = 8;
		System.out.println("Kedinin constructor' � �al��t�");
	}
	
	
}
