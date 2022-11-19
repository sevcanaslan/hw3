package com.sevcanaslan;

import java.util.ArrayList;

public class Televizyon {
	
	
			//Televizyon Sınıfı açalım
			//marka, String boyut(15inch), ArrayList kanallar,
			//kanallar Televizyon nesnesi oluşturulunca otomatik olarak initlaze edilsin
	
	//Televizyon sınıfı içinde
	//kanallarıOlusturmethodu yazalım
	//bu methodun içinde manuel 4 farklı kanal nesnesi oluşturulsun ve
	//bu 4 nesneyi kanallar arraylistinin içine atalım
	//ve Televizyon nesnesi oluşturduğumuzda bu method otomatik olarak çalışsın
	
	//haberTuru (Borsa, Spor, Magazin Haberleri)

	
	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanalListesi;
	
	public void kanallarıOlustur() {
		
		HaberKanali kanal1 = new HaberKanali("TV8",1 , "Magazin");
		MuzikKanali kanal2 = new MuzikKanali("DreamTurk",2 , "Müzik");
		HaberKanali kanal3 = new HaberKanali("Foxtv",3 , "Borsa");
		MuzikKanali kanal4 = new MuzikKanali("KralFM",4 , "Müzik");
		kanalListesi.add(kanal1);
		kanalListesi.add(kanal2);
		kanalListesi.add(kanal3);
		kanalListesi.add(kanal4);
		

		}
	public void kana1goster() {
		System.out.println("Kanal adı: "+ kanalListesi.get(0).getKanalAdi()+" Kanal no:"+ kanalListesi.get(0).getKanalNo());
	}
	public void kana2goster() {
		
		System.out.println("Kanal adı: "+ kanalListesi.get(1).getKanalAdi()+" Kanal no:"+ kanalListesi.get(1).getKanalNo() );
	}
	public void kana3goster() {
		
		System.out.println("Kanal adı: "+ kanalListesi.get(2).getKanalAdi()+" Kanal no:"+ kanalListesi.get(2).getKanalNo() );
	}
	public void kana4goster() {
		
		System.out.println("Kanal adı: "+ kanalListesi.get(3).getKanalAdi()+" Kanal no:"+ kanalListesi.get(3).getKanalNo() );
	};
	
	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		kanalListesi = new ArrayList<Kanal>();
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public String getBoyut() {
		return boyut;
	}



	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}



	public ArrayList<Kanal> getKanalListesi() {
		return kanalListesi;
	}



	public void setKanalListesi(ArrayList<Kanal> kanalListesi) {
		this.kanalListesi = kanalListesi;
	}
	
	
	

}
