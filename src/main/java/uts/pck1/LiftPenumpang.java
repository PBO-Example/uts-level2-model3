//LiftPenumpang.java
package uts.pck1;
public class LiftPenumpang{
	//atribut
	/*deklarasikan atribut di sini*/
	
	
	//konstruktor
	//konstruktor
	/*tulis konstruktor tanpa parameter di sini*/
	
	
	/*tulis konstruktor dengan  parameter di sini*/
	
	
	/*tulis kopi konstruktor di sini*/
	
	//setter
	/*tulis semua setter di sini*/
	
	
	
	
	//getter
	/*tulis semua getter di sini*/
	
	
	
	/*tulis method liftNaik() di sini*/
	/*Method liftNaik() akan mengembalikan sebuah string, baca file Readme.md*/
	/*Antisipasi ketiga kasus ini: a. jika posisi lantai yang dituju sama dengan posisi lift saat ini*/
	/* b. jika posisi lantai yang dituju kecil dari posisi lift saat ini*/
	/* c. jika posisi lantai yang dituju besar dari posisi lift saat ini*/
	
	
	/*tulis method liftTurun() di sini*/
	/*Method liftTurun() akan mengembalikan sebuah string, baca file Readme.md*/
	/*Antisipasi ketiga kasus seperti pada method liftNaik()*/
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/

	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof LiftPenumpang){
			LiftPenumpang lift = (LiftPenumpang) o;
			return (getMerk().equalsIgnoreCase(lift.getMerk())&& getPosisiLantai()==lift.getPosisiLantai() && getStatusPintu()==lift.getStatusPintu() && getAlarm().equals(lift.getAlarm() ));
		}
		return false;
	}
}