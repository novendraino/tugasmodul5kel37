package tugasmodul5;

import java.util.Scanner;

/**
 *
 * @author HP PAV 14-BA004TX
 */
public class input {
    double total;
    double jml;
    perhitungan htg;
    
    public input(){ //constructor 
        htg = new perhitungan(); //inisialisasi object htg dari class perhitungan
        masukData(); //memanggil method masuk data
    }
    
    public void masukData(){
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan jumlah barang : ");
        jml = data.nextInt();
        htg.jml = this.jml;
    }
    
    public void hasiltotal(){   
       total = (double) htg.hitungkali();
    }
    
    public void hasiltotal2(){   
       total = (double) htg.hitungkali2();
    }
    
    public void hasiltotal3(){   
       total = (double) htg.hitungkali3();
    }
    
    public void tampilTotal(){
        System.out.println("Total yang harus dibayar : \nRp "+total);
    }
}
