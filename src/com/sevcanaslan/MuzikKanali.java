package com.sevcanaslan;

public class MuzikKanali extends Kanal {
	
	
	//MuzikKanalı sınıfı açalım
	//Kanal sınıfından extend alıcak
	//haberTuru (Borsa, Spor, Magazin Haberleri)
	
	private String haberTuru;
	
	public MuzikKanali(String kanalAdi, int kanalNo,  String haberTuru) {
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
