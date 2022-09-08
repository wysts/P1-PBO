package main;

import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;

public class Main2 {
	public static void main(String[] args) {
	    Balok ba = new Balok(10, 9, 3);
	    System.out.println("1. " + ba.getClass().getSimpleName());
	    ba.hitungLuas();
	    ba.hitungKeliling();
	    ba.hitungVolume();
	    ba.printInfo();

	    System.out.println("");
	
	    Kubus k = new Kubus(19);
	    System.out.println("2. " + k.getClass().getSimpleName());
	    k.hitungLuas();
	    k.hitungKeliling();
	    k.hitungVolume();
	    k.printInfo();
	    
	    System.out.println("");

	    Bola b = new Bola(10);
	    System.out.println("3. " + b.getClass().getSimpleName());
	    b.hitungLuas();
	    b.hitungKeliling();
	    b.hitungVolume();
	    b.printInfo();
  	
	}

}