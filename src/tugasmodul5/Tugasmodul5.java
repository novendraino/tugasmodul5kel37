package tugasmodul5;

import java.util.Scanner;

/**
 *
 * @author HP PAV 14-BA004TX
 */
public class Tugasmodul5 {
    static void tampil(String judul){ 
        System.out.println(judul);
    }
    
    public static void main(String[] args) {
        tampil ("---------TOKO BUAH---------");
        String [][] daftar ={
        {" NO. ","   BUAH    ","    HARGA   "},    
        {" 1.  ","   APEL    ","  Rp 5.000  "},
        {" 2.  ","   JERUK   ","  Rp 4.000  "},
        {" 3.  ","   MANGGA  ","  Rp 7.000  "},
        };
        int b, k;
        for (b=0;b<4;b++){
            for (k=0;k<3;k++){
                System.out.print(daftar[b][k]+" ");}
        System.out.println("");}
        System.out.println("");
        
        Scanner pilih = new Scanner(System.in);
        System.out.println("Masukkan pilihan yang diinginkan : ");
        String angka = pilih.next();
        
        switch(angka){
        case "1":{
        input pil = new input(); //inisialisasi object dari class input
        
        pil.hasiltotal(); //memanggil method hasiltotal yang ada di object pil
        pil.tampilTotal(); //memanggil method tampiltotal dari object pil
        break;}
        
        case "2":{
        input pil = new input(); //inisialisasi object dari class input
        
        pil.hasiltotal2(); //memanggil method hasiltotal2 yang ada di object pil
        pil.tampilTotal(); //memanggil method tampiltotal dari object pil
        break;}
        
        case "3":{
        input pil = new input(); //inisialisasi object dari class input
        
        pil.hasiltotal3(); //memanggil method hasiltotal3 yang ada di object pil
        pil.tampilTotal(); //memanggil method tampiltotal dari object pil
        break;}
        
        default:{
        System.out.println("Masukkan Pilihan Dengan Benar");
        break;}
        }
    }    // TODO code application logic here
}
