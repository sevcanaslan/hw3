package com.sevcanaslan;

public class HaberKanali extends Kanal {
	
	//HaberKanalı sınıfı açalım
	//Kanal sınıfından extend alıcak
	//haberTuru (Borsa, Spor, Magazin Haberleri)
	
	private String haberTuru;
	
	
	


	public HaberKanali(String kanalAdi, int kanalNo,  String haberTuru) {
		super(kanalAdi,kanalNo);
		this.haberTuru= haberTuru;
		
		
		

	}





	public String getHaberTuru() {
		return haberTuru;
	}





	public void setHaberTuru(String haberTuru) {
		this.haberTuru = haberTuru;
	}

}
