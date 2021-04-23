package gajipegawai_xi.rpl.pkg4_03_anila.dwi.lestari;

import java.util.Scanner;

public class GajiPegawai_XIRPL4_03_AnilaDwiLestari {

    
    public static void main(String[] args) {
       int i = 0;
       while(i<5){
           Scanner input =new Scanner(System.in);
           
           System.out.print("Masukkan Nama Pegawai : ");
           String nama = input.next();
           System.out.print("Masukkan Jumlah Kehadiran : ");
           int jk = input.nextInt();
           
           i++;
           
           if(jk<20){
               int gaji = jk * 50000;
               int gaji2 = gaji - (gaji*10/100);
               System.out.println("|---------------------------------|");
               System.out.println("Nama Pegawai : " + nama);
               System.out.println("Gaji Pegawai : " + gaji2);
               System.out.println("");
               
           }else if (jk>=20){
               int gaji = jk * 50000;
               System.out.println("|---------------------------------|");
               System.out.println("Nama Pegawai : " + nama);
               System.out.println("Gaji Pegawai : " + gaji);
               System.out.println("");
           }
       }
    }
    
}
