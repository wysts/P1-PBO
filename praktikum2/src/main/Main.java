package main;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;

public class Main {
	public static void main(String[] args) {
	    Lingkaran l = new Lingkaran(15);
	    System.out.println("1. " + l.getClass().getSimpleName());
	    l.hitungLuas();
	    l.hitungKeliling();
	    l.printInfo();

	    System.out.println("");
	
	    Persegi p = new Persegi(10);
	    System.out.println("2.  " + p.getClass().getSimpleName());
	    p.hitungLuas();
	    p.hitungKeliling();
	    p.printInfo();

	    System.out.println("");
	
	    PersegiPanjang pp = new PersegiPanjang(6, 9);
	    System.out.println("3.  " + pp.getClass().getSimpleName());
	    pp.hitungLuas();
	    pp.hitungKeliling();
	    pp.printInfo();

	  }
	  
}
