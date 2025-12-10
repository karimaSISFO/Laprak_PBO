/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laprak4_karima;

/**
 *
 * @author Hp
 */
public class Laprak4_karima {

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        
        mhs.setNama("Karima");
        mhs.setUmur(19);
        mhs.setNim("13120240038");
        
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama Mahaiswa: "+ mhs.getNama());
        System.out.println("Umur : "+ mhs.getUmur());
        System.out.println("NIM : "+ mhs.getNim());
        
    }
}
