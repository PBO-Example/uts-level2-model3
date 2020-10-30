//LiftPenumpang.java
package uts.pck1;

public class LiftPenumpang{
	//atribut
	private String merk;
	private int posisiLantai;
	private boolean statusPintu;
	private boolean alarm;
	
	//konstruktor
	public LiftPenumpang(){
		merk ="Hyundai";
		posisiLantai=1;
		statusPintu=false;
		alarm=false;
	}
	public LiftPenumpang(String merk,int posisiLantai, boolean statusPintu,boolean alarm){
		this.merk=merk;
		this.posisiLantai=posisiLantai;
		this.statusPintu=statusPintu;
		this.alarm=alarm;
	}
	public LiftPenumpang(LiftPenumpang lift){
		merk = lift.merk;
		posisiLantai=lift.posisiLantai;
		statusPintu=lift.statusPintu;
		alarm=lift.alarm;
	}
	
	//setter
	public void setMerk(String merk){
		this.merk=merk;
	}
	public void setPosisiLantai(int posisiLantai){
		this.posisiLantai=posisiLantai;
	}
	public void setStatusPintu(boolean statusPintu){
		this.statusPintu=statusPintu;
	}
	public void setAlarm(boolean alarm){
		this.alarm=alarm;
	}
	//getter
	public String getMerk(){
		return merk;
	}
	public int getPosisiLantai( ){
		return posisiLantai;
	}
	public boolean getStatusPintu( ){
		return statusPintu;
	}
	public boolean getAlarm(){
		return alarm;
	}
	public String liftNaik(int posisiLantai){
		if(this.posisiLantai< posisiLantai && posisiLantai>0){
			int delta= posisiLantai-this.posisiLantai;
			this.posisiLantai=posisiLantai;
			return ("\nLift naik "+delta+" lantai, "+"sekarang anda berada di lantai "+posisiLantai);
		}
		else if(this.posisiLantai> posisiLantai)
			return ("\nAnda berada di lantai yang lebih tinggi, silakan tekan tombol turun");
		else 
			return ("\nAnda sudah berada di lantai "+posisiLantai);
			
	}
	public String liftTurun(int posisiLantai){
		if(this.posisiLantai> posisiLantai && posisiLantai>0){
			int delta= this.posisiLantai-posisiLantai;
			this.posisiLantai=posisiLantai;
			return ("\nLift turun "+delta+" lantai, "+"sekarang anda  berada di lantai "+posisiLantai);
		}
		else if(this.posisiLantai< posisiLantai)
			return ("\nAnda berada di lantai yang lebih rendah, silakan tekan tombol naik");
		else 
			return ("\nAnda sudah berada di lantai "+posisiLantai);
			
	}
	public String toString(){
		return "Posisi lift "+merk+" di lantai "+posisiLantai+", pintu dalam keadaan "+ ((statusPintu==true)?"terbuka":"tertutup")+", dan alarm dalam keadaan "+ ((alarm==true)?"aktif":"non aktif");
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof LiftPenumpang){
			LiftPenumpang lift = (LiftPenumpang) o;
			return (getMerk().equalsIgnoreCase(lift.getMerk())&& getPosisiLantai()==lift.getPosisiLantai() && getStatusPintu()==lift.getStatusPintu() && getAlarm()==lift.getAlarm() );
		}
		return false;
	}
}