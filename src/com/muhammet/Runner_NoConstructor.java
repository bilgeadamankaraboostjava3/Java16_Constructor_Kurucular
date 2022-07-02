package com.muhammet;

import com.muhammet.entity.Kedi;
import com.muhammet.entity.Personel;
import com.muhammet.entity.Urun_NoDefaultConstructor;

public class Runner_NoConstructor {

	public static void main(String[] args) {
		
		
		Urun_NoDefaultConstructor urun = 
				new Urun_NoDefaultConstructor("Þeker","e39034435443",69);
		Kedi kedi = new Kedi();
		Personel personel = new Personel();
		System.out.println("id......: "+ urun.id);
		System.out.println("ad......: "+ urun.ad);
		System.out.println("barkod......: "+ urun.barkod);
		System.out.println("fiyat......: "+ urun.fiyat);
		System.out.println("state......: "+ urun.state);
	}

}
