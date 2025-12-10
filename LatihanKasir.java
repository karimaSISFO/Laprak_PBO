/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihankasir;

/**
 *
 * @author Hp
 */import java.util.Scanner;
import java.util.ArrayList;
public class LatihanKasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "Mufli";
        double uang = 10000.0;
        ArrayList<String> History =  new ArrayList<>();
        int pilihan;
        
        do{
            System.out.println("\nNama Customer: "+ nama);
            System.out.println("Total uang: "+ uang);
            System.out.println("1. Ambil uang");
            System.out.println("2. setor uang");
            System.out.println("3. Tampilkan History");
            System.out.println("4. exit");
            System.out.println("Masukkan pilihan[1-4]: ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("\nMasukkan Nominal Uang: ");
                    double ambil=input.nextDouble();
                    if (ambil>uang){
                        System.out.println("Saldo anda tidak cukup");
                    }else{
                        System.out.println(uang+"$ Berhasil di ambil di bank");
                        uang -= ambil;
                        History.add(ambil+ "ambil uang");
                    }                   
                    break;
                case 2:
                    System.out.println("Massukkan nominal uang: ");
                    double setor= input.nextDouble();
                    uang += setor;
                    History.add(setor+ "uang di simpan");
                    break;
                case 3:
                    System.out.println("\nHasil transaksi: ");
                    if (History.isEmpty()){
                        System.out.println("Belum ada transaksi");
                    }else{
                        for(int i=0; i<History.size(); i++){
                            System.out.println("Transaksi " +(i+1)+ " = " + History.get(i));
                            
                        }
                    }
                    break;
                case 4: 
                    System.out.println("terimaksih, program selesai");
                    break;
                default:
                    System.out.println("Program tidak tersedia!");
        }
        }while(pilihan !=4);
        input.close();
    }
}
