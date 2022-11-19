package com.sevcanaslan;

import java.util.Scanner;

public class Main {
	static Televizyon tv;
	static Boolean tvAcıkMi;
	static int sesDuzeyi= 0;
	static int bulundugunKanal;
	
	
	private static void menuGoster() {
		System.out.println("***MENU****");
		System.out.println(
				"0- Çıkış \n" + 
						"1-- Televizyon Kur\n" +
						"2-- Televizyonu Aç\n" + 
						"3-- Sesini Artır\n" +
						"4--Sesi Azalt\n" +
						"5-- Kanal Değiştir\n" +
						"6-- Kanal Bilgisi Goster\n" +
						"7-- Televizyonu Kapat\n" +
						"8-- Menüyü Goster\n"
				);

	}

	
	public static void main(String[] args) {
		menuGoster();

		boolean check = true;
		while (check) {
			System.out.println("Seçimiz (Menüyü Görmek için 8)");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				tvKurveKanallariOlustur();
				break;
			case 2:
				televizyonuAc();
				break;
			case 3:
				sesiniArtır();
				break;
			case 4:
				sesiniAzalt();
				break;
			case 5:
				kanalDegistir();
				break;
			case 6:
				kanalBilgisiniGoster();
				break;
			case 7:
				tvKapat();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				check = false;
				System.out.println("Sistemden çıktınız");
				break;

			}
		}
		
		
		
		
		
		
		
		

	}
	
	private static void tvKapat() {
		if(tvAcıkMi==false) {
			System.out.println("Televizyonunuz zaten kapalıdır.");
			
		}
		else {
			tvAcıkMi=true;
			System.out.println("Televizyonunuz kapatılmıştır.");
		}
			
		}

	private static void kanalBilgisiniGoster() {
		if(tvAcıkMi==false) {
			System.out.println("Televizyonunuz kapalıdır.");
			
		}
		else {
			System.out.println("Kanal Listesi: ");
			tv.kana1goster();
			tv.kana2goster();
			tv.kana3goster();
			tv.kana4goster();
			System.out.println("Şuan bulunduğunuz kanal: "  );
			switch(bulundugunKanal) {
			case 1:
				tv.kana1goster();
				bulundugunKanal=1;
				break;
			case 2:
				tv.kana2goster();
				bulundugunKanal=2;
				break;
			case 3:
				tv.kana3goster();
				bulundugunKanal=3;
				break;
			case 4:
				tv.kana4goster();
				bulundugunKanal=4;
				break;
			}
				
		}}

	private static void kanalDegistir() {
		
		if(tvAcıkMi==false) {
			System.out.println("Televizyonunuz kapalıdır.");
			
		}
		else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hangi kanalı açmak istiyorsunuz?");
			 bulundugunKanal = scanner.nextInt();
			
			switch(bulundugunKanal) {
			case 1:
				tv.kana1goster();
				bulundugunKanal=1;
				break;
			case 2:
				tv.kana2goster();
				bulundugunKanal=2;
				break;
			case 3:
				tv.kana3goster();
				bulundugunKanal=3;
				break;
			case 4:
				tv.kana4goster();
				bulundugunKanal=4;
				break;
				
			}
		
		}	

		}

	private static void sesiniAzalt() {
		if(tvAcıkMi==false) {
			System.out.println("Televizyonunuz kapalıdır.");
			
		}
		else {
			sesDuzeyi= sesDuzeyi-1;
			System.out.println("Ses seviyesi " + sesDuzeyi);
		
		}	
		
			
		}

	private static void sesiniArtır() {
		if(tvAcıkMi==false) {
			System.out.println("Televizyonunuz kapalıdır.");
			
		}
		else {
			sesDuzeyi= sesDuzeyi+1;
			System.out.println("Ses seviyesi " + sesDuzeyi);
	
		
		}	
		
		}

	private static void televizyonuAc() {
		
		if(tv == null) {
			System.out.println("Televizyon oluşturunuz.");	
				}
		else {
		if(tvAcıkMi) {
			System.out.println("Televizyonunuz zaten açıktır.");
		}
		else {
			System.out.println("Televizyonunuz açılmıştır.");	
			tvAcıkMi= true;
		}	
		}
	
		}

	public static void tvKurveKanallariOlustur() {
		if(tv == null) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Marka giriniz: ");
		String marka = scanner.nextLine();
		System.out.println("Boyut giriniz: ");
		String boyut = scanner.nextLine();
		tv= new Televizyon(marka, boyut);
		System.out.println("Televizyonunuz kurulmuştur"+" Tv markanız: "+  tv.getMarka()+" Tv boyutunuz: "+ tv.getBoyut());
		
		tvAcıkMi= false;
		tv.kanallarıOlustur();
		
		}
		else {
			System.out.println("Televizyonunuz zaten kurulmuştur!");
		}
		
	}
	

	

}
