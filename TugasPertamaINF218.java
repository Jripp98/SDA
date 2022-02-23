import java.io.*;
import java.util.*;

/**
 * <h1>Tugas 1 INF-218 Struktur Data dan Algoritma</h1>
 * <h3>Semester Genap 2021/2022</h3>
 * Class ini adalah class yang harus diimplementasikan sebagai tugas 1 INF-218 Struktur Data dan Algoritma
 * <br> Anda harus mengisi method-method yang masih kosong sehingga menjadi method yang benar.
 * <br> Setiap method yang berhasil diimplementasikan dengan baik bernilai 10 poin dan jika gagal berniali 0 poin.
 * <br> Anda harus mengimplementasikan semua method di kelas ini.
 * <br> Jangan merubah nama method, tipe data yang di-return dan parameter-parameter dari headernya.
 * <br> Caranya mengimplementasikannya adalah dengan menghapus throw new TidakDiimplementasiException
 * <br> dan menggantinya dengan code program anda yang benar.
 * <br> Selamat mencoba dan Semoga berhasil.......
 *
 * <p>Author     : Zahnur
 * <br>Version   : 1.0  (5 Maret 2022)
 ********************************************************************************************/

public class TugasPertamaINF218{					

 /**
  * Method ini digunakan untuk menghitung banyaknya bilangan prima dalam array yang diberikan. 
  * <br> Sebagai contoh: jika dataArray adalah {2, 3, 4, 5, 6} maka yang di-return adalah 3.
  * <br> Sebagai contoh: jika dataArray adalah {7, 8, 9, 10} maka yang di-return adalah 1.
  * <br> Sebagai contoh: jika dataArray adalah {11, 13, 29, 35} maka yang di-return adalah 3.
  * <br> Sebagai contoh: jika dataArray adalah {2, 8, 9, 10} maka yang di-return adalah 0.
  * <br> dataArray berisikan bilangan integer positif, tidak berulang dan berukuran n dimana 1 <= n <=100.  
  * <p> 
  * @param dataArray : array yang diberikan.
  * @return int : banyaknya bilangan prima dalam array.
  */ 
   public int banyakPrimaDalamArray(int [] dataArray) {	
      int jumlahBilanganPrima = 0;
      for(int i = 0; i < dataArray.length;i++){
         if(dataArray[i] > 1){
            boolean isPrima = true;
            for(int j = 2; j < dataArray[i]; j++){
               if(dataArray[i] % j == 0){
                  isPrima = false;
                  break;
               }
            }
            if(isPrima){
               jumlahBilanganPrima++;
            }
         }
      }
      return jumlahBilanganPrima;
   } // akhir dari method banyakPrimaDalamArray

 /** 
  * Method ini digunakan untuk menghitung jumlah dari data-data yang bernilai ganjil yang terdapat dalam array.
  * <br> Sebagai contoh: jika data dalam array adalah {2, 8, 11, 7, 17} maka yang di-return adalah 35.
  * <br> Sebagai contoh: jika data dalam array adalah {-12, 8, 11, 100, 1001} maka yang di-return adalah 1012.
  * <br> Sebagai contoh: jika data dalam array adalah {2, 8, 10, 100, 1000} maka yang di-return adalah 0.
  * <br> dataArray berisikan bilangan integer, tidak berulang dan berukuran n dimana 1 <= n <=100.
  * <br> Data dalam array tidak berulang dan berukuran n dimana 1 <= n <=100. 
  * <p>
  * @param dataArray : array yang diberikan.
  * @return int : jumlah dari data-data yang bernilai ganjil.
  */ 
   public int jumlahBilanganGanjilDalamArray(int [] dataArray) {
      int jumlahGanjil = 0;

      for (int i = 0; i < dataArray.length; i++) {
         if (dataArray[i] % 2 != 0) {
            jumlahGanjil = jumlahGanjil + dataArray[i];
         }
      }
      return jumlahGanjil;
   } // akhir dari method jumlahBilanganGanjilDalamArray 				
          
 /** 
  * Method ini digunakan untuk menghapus sebuah data yang terdapat dalam array.
  * <br> Jika data yang akan dihapus tidak terdapat di dalam dataArray maka proses dilewatkan.
  * <br> Jika data yang akan dihapus terdapat di dalam dataArray maka ukuran dataArray akan berkurang 1.
  * <br> dataArray berisikan bilangan integer, tidak berulang dan berukuran n dimana 2 <= n <=100.
  * <p>
  * @param dataArray : array yang diberikan.
  * @param bil : nilai data yang akan dihapus.
  * @return int [] : array yang direturn
  */ 
   public int [] hapusDataArray(int [] dataArray, int bil) {	
      int [] dataArrayBaru = new int[dataArray.length - 1];
      int jumlahData = 0;
      for (int i = 0; i < dataArray.length; i++) {
         if (dataArray[i] != bil) {
            dataArrayBaru[jumlahData] = dataArray[i];
            jumlahData++;
         }
      }
      return dataArrayBaru;
   } // akhir dari method hapusDataArray  
    
 /**
  * Method ini digunakan untuk mengurutkan data secara desending yang terdapat dalam array.
  * <br> Urutan dalam Descending (dari data dengan nilai terbesar ke yang terkecil)
  * <br> Anda harus menggunakan algoritma Bubble Sort untuk mengurutkan data (sorting)
  * <p>
  * @param dataArray : array yang diberikan.
  * @return int [] : array dari data yang telah terurut.
  */
   public int [] sortingDescending(int [] dataArray) { 
      throw new TidakDiimplementasiException("Method urutDataDescending belum diimplementasikan"); 
   } // akhir dari method urutDataDescending()
   
  /**
  * Method untuk mencari nilai data median yang terdapat dalam array.
  * <br> Median adalah data pada urutan ditengah pada array yang telah terurut secara asending.
  * <br> Untuk jumlah data n ganjil, median adalah nilai dari X[(n+1)/2], dimana X(n) adalah data pada urutan ke n.
  * <br> Untuk jumlah data n genap, median adalah (X[(n/2)]+X[(n+1)/2])/2, dimana X(n) adalah data pada urutan ke n.
  * <br> Perhatian bahwa n pada formula median di atas dimulai dengan satu, sedangkan indeks array di java dimulai dari nol.
  * <p> 
  * @param dataArray : array yang diberikan.
  * @return double : nilai data median dari array.
  */ 
   public double median(int [] dataArray) {	
      throw new TidakDiimplementasiException("Method dataTerbesar belum diimplementasikan"); 
   } // akhir dari method dataTerbesar 
 
 /**
  * Method untuk membaca sebuah file data String. 
  * <br> Anda harus mengimplementasikan dengan benar method ini untuk mengimplementasikan method-method selanjutnya.
  * <br> Nama file yang harus dibaca bernama "dataString.txt". Jadi s="dataString.txt".
  * <br> file dataString memuat beberapa baris kalimat termasuk tanda baca, seperti tanda titik, koma, tany, dll.
  * <br> Anda harus memenggal kalimat menjadi kata-kata dan menghilangkan tanda baca tersebut.
  * <br> Gunakan Class StringTokenizer untuk memenggal kalimat menjadi kata-kata dan menghilangkan tanda baca.    
  * <br> Anda harus menyimpan kata-kata tersebut kedala array, tiap indeks satu kata. 
  * <br> Array boleh memuat kata berulang dan indeks array dimulai dari indeks nol.
  * <br> Contoh: Kalimat "Apa nama saya dan nama kamu sama?" direturn sebagai array {Apa, nama, saya, dan, nama, kamu, sama}
  * <br> Contoh: Kalimat "Apa? Ah, jangan! cukup saya saja." direturn sebagai array {Apa, Ah, jangan, cukup, saya, saja}
  * <p> 
  * @return String [] : String araay dari kata-kata dalam file.
  */ 
   public String [] bacaFile() {  
   //Hapus ketiga baris berikut dan implementasikan code anda dengan benar. 
      String [] s = new String[1]; 
      s[0]="";
      return s;                             		   
   } // akhir dari method bacaFile
   
 /**
  * Method ini digunakan untuk menentukan pengulangan kata terbanyak yang terdapat dalam file "dataString.txt".
  * <br> Array dataString adalah array yang di-return dari method bacaFile().
  * <br> Dijamin hanya ada satu kata yang muncul paling banyak dari pada kata lainnya.
  * <br> Contoh: Kalimat "Apa nama saya dan nama kamu sama?" direturn String "nama".
  * <br> Kata dengan huruf besar (kapital) dan huruf kecil dipandang sama dan test case menggunakan huruf kecil.
  * <br> Contoh: Kalimat "Sama atau tidak sama?" yang direturn String "sama".
  * <p>
  * @param dataString: array yang di-return dari method bacaFile() 
  * @return String : kata terbanyak yang terdapat dalam file
  */ 
   public String pengulanganKataTerbanyak(String [] dataString) {  
      throw new TidakDiimplementasiException("Method pengulanganKataTerbanyak belum diimplementasikan"); 
   } // akhir dari method pengulanganKataTerbanyak
      
 /**
  * Method ini digunakan untuk menentukan jumlah kata berbeda yang terdapat dalam file "dataString.txt".
  * <br> Array dataString adalah array yang di-return dari method bacaFile().
  * <br> Kata-kata yang sama hanya dihitung sekali.
  * <br> Kata dengan huruf besar (kapital) dan huruf kecil dipandang sama dan test case menggunakan huruf kecil.
  * <br> Contoh: Kalimat "Apa nama saya dan nama kamu sama?" direturn  adalah 6.
  * <br> Contoh: Kalimat "Kata-kata dia menyenangkan." direturn  adalah 3.
  * <br> Contoh: Kalimat "Kata-kata kata." direturn  adalah 1.
  * <p>
  * @param dataString: array yang di-return dari method bacaFile() 
  * @return int : jumlah kata berbeda yang terdapat dalam file
  */
   public int jumlahKataBerbeda(String [] dataString) { 
      throw new TidakDiimplementasiException("Method jumlahKataBerbeda belum diimplementasikan");
   } // akhir dari method jumlahKataBerbeda   
   
 /**
  * Method ini digunakan untuk menentukan kata dengan karakter terbanyak yang terdapat dalam file "dataString.txt".
  * <br> Array dataString adalah array yang di-return dari method bacaFile().
  * <br> Dijamin hanya ada satu kata yang memiliki karakter paling banyak.
  * <br> Kata dengan huruf besar (kapital) dan huruf kecil dipandang sama dan test case menggunakan huruf kecil.
  * <br> Contoh: Kalimat "Apakah nama saya dan nama kamu sama?" direturn  adalah "apakah".
   * <br> Contoh: Kalimat "Apa saya berhasil?" direturn  adalah "berhasil".
  * <p>
  * @param dataString: array yang di-return dari method bacaFile()
  * @return String : kata dengan karakter terbanyak
  */
   public String kataTerpanjang(String [] dataString) {
      throw new TidakDiimplementasiException("Method kataTerpanjang belum diimplementasikan");  
   } // akhir dari method kataTerpanjang  
   
 /**
  * Method ini digunakan untuk mengurutkan kata dalam dataString dalam urutan ascending.
  * <br> Array dataString adalah array yang di-return dari method bacaFile().
  * <br> Kata yang diurut boleh berulang. 
  * <br> Anda boleh menggunakan metode sorting apapun yang tersedia.
  * <p>
  * @param dataString: array yang di-return dari method bacaFile().
  * @return String []: array terurut.
  */
   public String [] sortingAscending(String [] dataString) {	
   //Hapus ketiga baris berikut dan implementasikan code anda dengan benar.
      String [] s = new String[1]; 
      s[0]="";
      return s; 
      //throw new TidakDiimplementasiException("Method sortingAscending belum diimplementasikan"); 
   } // akhir dari method sortingAscendin
     
 /**
  * Method ini digunakan untuk mengurutkan kata-kata yang panjangnya lebih dari lima huruf dalam urutan ascending. 
  * <br> Array dataString adalah array yang di-return dari method bacaFile(). 
  * <br> Kata yang diurut tidak boleh berulang. 
  * <br> Anda boleh menggunakan metode sorting apapun yang tersedia.
  * <p>
  * @param dataString: array yang di-return dari method bacaFile()
  * @return String []: array terurut
  */
   public String [] kataLebihLimaHurufBerbedaTerurutAscending(String [] dataString) {	
   //Hapus ketiga baris berikut dan implementasikan code anda dengan benar.
      String [] s = new String[1]; 
      s[0]="";
      return s; 
   } // akhir dari method kataLebihLimaHurufBerbedaTerurutAscending 
}