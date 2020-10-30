//Driver.java
package uts.pck2;
import uts.pck1.LiftPenumpang;
public class Driver{
	public static void main(String[] args){
		LiftPenumpang r = new LiftPenumpang();
		System.out.print(r);
		System.out.print(r.liftTurun(8));
	}
}