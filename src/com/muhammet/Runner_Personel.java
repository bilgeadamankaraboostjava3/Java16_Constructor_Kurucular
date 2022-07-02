package com.muhammet;

import com.muhammet.entity.Personel;

public class Runner_Personel {

	public static void main(String[] args) {
	
		Personel personel = new Personel();
		personel.ad = "Hasan";
		personel.adres = "Ankara";
		personel.telefon = "0 555 999 88 77";
		personel.dogumyili = 1980;				
		System.out.println("ad..........: "+ personel.ad);
		System.out.println("adres.......: "+ personel.adres);
		System.out.println("tel.........: "+ personel.telefon);
		System.out.println("dogum.......: "+ personel.dogumyili);
		System.out.println("----------------------------------------------------");
		personel = new Personel("Hayri","Ýzmir","0 555 777 77 77", 1990);
		System.out.println("ad..........: "+ personel.ad);
		System.out.println("adres.......: "+ personel.adres);
		System.out.println("tel.........: "+ personel.telefon);
		System.out.println("dogum.......: "+ personel.dogumyili);
	}

}
