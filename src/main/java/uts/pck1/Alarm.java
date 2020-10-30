//Alarm.java
package uts.pck1;
public class Alarm{
	//atribut
	private String jenisAlarm;
	private int levelSuara;
	private boolean status;
	
	//konstruktor
	public Alarm(){
		jenisAlarm = "Alarm Easyguard";
		levelSuara =1;
		status=false;
	}
	public Alarm(String jenisAlarm, int levelSuara, boolean status){
		this.jenisAlarm = jenisAlarm;
		this.levelSuara = levelSuara;
		this.status = status;
	}
	public Alarm(Alarm a){
		jenisAlarm = a.jenisAlarm;
		levelSuara = a.levelSuara;
		status = a.status;
	}
	//setter
	public void setJenisAlarm(String jenisAlarm){
		this.jenisAlarm = jenisAlarm;
	}
	public void setLevelSuara(int levelSuara){
		this.levelSuara = levelSuara;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	
	//getter
	public String getJenisAlarm(){
		return jenisAlarm;
	}
	public int getLevelSuara(){
		return levelSuara;
	}
	public boolean getStatus(){
		return status;
	}
	
	public String toString(){
		return jenisAlarm+" level suara "+levelSuara +" dalam keadaan "+ ((status==true)?"aktif":"non aktif");
	}
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Alarm){
			Alarm alarm = (Alarm) o;
			return (getJenisAlarm().equalsIgnoreCase(alarm.getJenisAlarm()) && getLevelSuara()== alarm.getLevelSuara() );
		}
		return false;
	}
}