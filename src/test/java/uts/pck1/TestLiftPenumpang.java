//TestLiftPenumpang.java
package uts.pck1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestLiftPenumpang {

	LiftPenumpang rum;
			
	static Stream<Arguments> rumArray1() {
    return Stream.of(
        Arguments.of("Hyundai",1,false,false),
        Arguments.of("Toyota",5,true,true),
		Arguments.of("Panasonic",10,true,false)
    );}
	static Stream<Arguments> rumArray2() {
    return Stream.of(
        Arguments.of(new LiftPenumpang("Hyundai",1,false,false)),
        Arguments.of(new LiftPenumpang("Toyota",5,true,true)),
		Arguments.of(new LiftPenumpang("Panasonic",10,true,false))
    );}
	
	static Stream<Arguments> rumArray3() {
    return Stream.of(
        Arguments.of("Hyundai",1,false,false,new LiftPenumpang("Hyundai",1,false,false)),
        Arguments.of("Toyota",5,true,true,new LiftPenumpang("Toyota",5,true,true)),
		Arguments.of("Panasonic",10,true,false,new LiftPenumpang("Panasonic",10,true,false))
    );}

	static Stream<Arguments> rumArray4() {
    return Stream.of(
        Arguments.of(new LiftPenumpang("Hyundai",1,false,false),"Posisi lift Hyundai di lantai 1, pintu dalam keadaan tertutup, dan alarm dalam keadaan non aktif"),
        Arguments.of(new LiftPenumpang("Toyota",5,true,true),"Posisi lift Toyota di lantai 5, pintu dalam keadaan terbuka, dan alarm dalam keadaan aktif"),
		Arguments.of(new LiftPenumpang("Panasonic",10,true,false),"Posisi lift Panasonic di lantai 10, pintu dalam keadaan terbuka, dan alarm dalam keadaan non aktif")
    );}
	
	static Stream<Arguments> rumArray5() {
    return Stream.of(
        Arguments.of(new LiftPenumpang("Hyundai",1,false,false),10,"\nLift naik 9 lantai, sekarang anda berada di lantai 10"),
        Arguments.of(new LiftPenumpang("Toyota",5,true,true), 5,"\nAnda sudah berada di lantai 5"),
		Arguments.of(new LiftPenumpang("Panasonic",10,true,false),8,"\nAnda berada di lantai yang lebih tinggi, silakan tekan tombol turun")
    );}
	
	static Stream<Arguments> rumArray6() {
    return Stream.of(
        Arguments.of(new LiftPenumpang("Hyundai",10,false,false),8,"\nLift turun 2 lantai, sekarang anda  berada di lantai 8"),
        Arguments.of(new LiftPenumpang("Toyota",11,true,true), 11,"\nAnda sudah berada di lantai 11"),
		Arguments.of(new LiftPenumpang("Panasonic",5,true,false),10,"\nAnda berada di lantai yang lebih rendah, silakan tekan tombol naik")
    );}
	
		
	@Test
	public void testKonstruktorI()
	{ 
		 rum = new LiftPenumpang();
		 assertThat("Hyundai", equalToIgnoringCase(rum.getMerk()));
		 assertEquals(1, rum.getPosisiLantai());
		 assertEquals(false, rum.getStatusPintu());
		 assertEquals(false, rum.getAlarm()); 
	}
	@ParameterizedTest
	@MethodSource("rumArray1")
	public void testKonstruktorII(String merk, int lt, boolean p, boolean a) {
		rum = new LiftPenumpang(merk,lt,p,a);
		assertThat(merk, equalToIgnoringCase(rum.getMerk()));
		 assertEquals(lt, rum.getPosisiLantai());
		 assertEquals(p, rum.getStatusPintu());
		 assertEquals(a, rum.getAlarm());  
	}
	

	@ParameterizedTest
	@MethodSource("rumArray2")
	public void testKopiKonstruktor(LiftPenumpang r) {
		rum = new LiftPenumpang(r);
		assertThat(r.getMerk(), equalToIgnoringCase(rum.getMerk()));
		 assertEquals(r.getPosisiLantai(), rum.getPosisiLantai());
		 assertEquals(r.getStatusPintu(), rum.getStatusPintu());
		 assertEquals(r.getAlarm(), rum.getAlarm()); 
		 assertNotSame(r,rum, "should not point to same Object");
	}

	@ParameterizedTest
	@MethodSource("rumArray3")
	void testSetter(String merk, int lt, boolean p, boolean a,LiftPenumpang r) {
		rum = new LiftPenumpang();
		rum.setMerk(merk);
		rum.setPosisiLantai(lt);
		rum.setStatusPintu(p);
		rum.setAlarm(a);
		assertEquals(r, rum); 
	}
	
	@ParameterizedTest
	@MethodSource("rumArray4")
	void testToString(LiftPenumpang r, String s) {
		assertThat(r.toString(), containsString(s));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray5")
	void testLiftNaik(LiftPenumpang lap, int lt, String psn) {
		assertThat(lap.liftNaik(lt), containsString(psn));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray6")
	void testLiftTurun(LiftPenumpang lap, int lt, String psn) {
		assertThat(lap.liftTurun(lt), containsString(psn));
	}
}