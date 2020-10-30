# Selamat!!! Anda sekarang sudah di UTS Praktikum Level 2 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 2](http://api.puro.del.ac.id/v1/file/b8cc2b53b40cc2574b81341cef02a83c)
>Realisasikan kelas LiftPenumpang dan kelas Alarm yang ada pada kelas diagram di atas ke dalam bahasa pemrograman Java. Untuk masing-masing kelas lengkapi dengan konstruktor tanpa parameter, konstruktor dengan parameter, kopi konstruktor, serta setter dan getter. Gunakan template yang disediakan di 
**src\main\java\uts**.

>**Anda boleh menggunakan (menyalin) kode program yang sudah anda hasilkan dari level 1**

>**Perhatikan bahwa, pada level 2 ini, tipe atribut alarm adalah Alarm.**

>**Untuk mendapatkan nilai sempurna pada level ini, konsentrasi menyesuaikan kode program kelas LiftPenumpang.java yang anda kerjakan pada level 1 sehingga semua konstruktor dan method dapat menerima atribut alarm yang bertipe Alarm (bukan String).**


## Rubrik Penilaian 
1. **[Poin 10]** program dilengkapi dengan konstruktor tanpa parameter yang set data dengan nilai default sebagai berikut:
merk lift Hyundai, lift berada di lantai 1, status pintu lift tertutup, dan alarm sedang dalam kondisi tidak aktif.
	
	> Perintah test: 
	
	
		>gradle test --tests TestLiftPenumpang.testKonstruktorI

2. **[Poin 15]** program dilengkapi dengan konstruktor dengan parameter 

	
	> Perintah test: 
	
	
		>gradle test --tests TestLiftPenumpang.testKonstruktorII

3. **[Poin 15]** program dilengkapi dengan kopi konstruktor
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLiftPenumpang.testKopiKonstruktor

4. **[Poin 15]** Program dilengkapi dengan sekumpulan setter dan getter	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLiftPenumpang.testSetter

5. **[Poin 15]** Program dilengkapi dengan method liftNaik(). Method ini akan mengembalikan suatu pesan.
> Misalnya data sebuah lift r kondisi di lantai 1 dan method liftNaik() dipanggil dengan r.liftNaik(10) maka pesan yang dihasilkan adalah: Lift naik 9 lantai, sekarang anda berada di lantai 10

> Misalnya data sebuah lift r kondisi di lantai 2 dan method liftNaik() dipanggil dengan r.liftNaik(2) maka pesan yang dihasilkan adalah: Anda sudah berada di lantai 2

> Misalnya data sebuah lift r kondisi di lantai 2 dan method liftNaik() dipanggil dengan r.liftNaik(1) maka pesan yang dihasilkan adalah: Anda berada di lantai yang lebih tinggi, silakan tekan tombol turun.

	
	> Perintah test: 
	
	
		> gradle test --tests TestLiftPenumpang.testLiftNaik

6. **[Poin 15]** Program dilengkapi dengan method liftTurun(). Method ini akan mengembalikan suatu pesan.
> Misalnya data sebuah lift r kondisi di lantai 10 dan method liftTurun() dipanggil dengan r.liftTurun(8) maka pesan yang dihasilkan adalah: Lift turun 2 lantai, sekarang anda  berada di lantai 8

> Misalnya data sebuah lift r kondisi di lantai 2 dan method liftTurun() dipanggil dengan r.liftTurun(2) maka pesan yang dihasilkan adalah: Anda sudah berada di lantai 2

> Misalnya data sebuah lift r kondisi di lantai 12 dan method liftTurun() dipanggil dengan r.liftTurun(21) maka pesan yang dihasilkan adalah: Anda berada di lantai yang lebih rendah, silakan tekan tombol naik.

	
	> Perintah test: 
	
	
		> gradle test --tests TestLiftPenumpang.testLiftTurun

7. **[Poin 15]** program dilengkapi dengan method toString() yang akan menampilkan data di dalam objek Rumah. Perhatikan contoh keluaran yang diberikan.
![Image of output of toString()](http://api.puro.del.ac.id/v1/file/a6f5e764ebbea8eb72235294d4545d21)	
	
	> Perintah test: 
	
	
		> gradle test --tests TestLiftPenumpang.testToString

**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
