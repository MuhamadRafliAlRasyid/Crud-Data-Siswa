package com.coba.belajar;

import java.util.ArrayList;
import java.util.Scanner;

public class DataSiswa {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nis = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nAplikasi Data Siswa Sekolah");
            System.out.println("=================================");

            System.out.println("1. Tambahkan Data Siswa ");
            System.out.println("2. Tampilkan Data Siswa ");
            System.out.println("3. Cari Data Siswa ");
            System.out.println("4. Hapus Data Siswa");
            System.out.println("5. Keluar");

            System.out.print("\nPilih Menu : ");
            pilih= input.nextInt();
            if (pilih ==1){
                System.out.print("Masukan Nama : ");
                String Nama = input.next();
                nama.add(Nama);

                System.out.print("Masukan Nis :");
                String Nis = input.next();
                nis.add(Nis);

                System.out.print("Masukan Alamat :");
                String Alamat = input.next();
                alamat.add(Alamat);
            } else if (pilih == 2) {
                System.out.println("\nData Mahasiswa");
                for (int i =0;i< nis.size(); i++){
                    System.out.println( i+1+"."+nis.get(i));
                }
                System.out.println("Pilihlah Menu Ke-3 Untuk Menampilkan Data ");
            } else if (pilih == 3) {
                System.out.println("Data Berapa Yang Ingin Dicari : ");
                int cari = input.nextInt();
                if(cari == 1){
                    System.out.println("\nNama : "+nama.get(0));
                    System.out.println("\nNis : "+nis.get(0));
                    System.out.println("\nAlamat : "+alamat.get(0));
                } else if (cari == 2) {
                    System.out.println("\nNama : "+nama.get(1));
                    System.out.println("\nNis : "+nis.get(1));
                    System.out.println("\nAlamat : "+alamat.get(1));
                }else if (cari == 3) {
                    System.out.println("\nNama : "+nama.get(2));
                    System.out.println("\nNis : "+nis.get(2));
                    System.out.println("\nAlamat : "+alamat.get(2));
                }else if (cari == 4) {
                    System.out.println("\nNama : "+nama.get(3));
                    System.out.println("\nNis : "+nis.get(3));
                    System.out.println("\nAlamat : "+alamat.get(3));
                }else if (cari == 5) {
                    System.out.println("\nNama : "+nama.get(4));
                    System.out.println("\nNis : "+nis.get(4));
                    System.out.println("\nAlamat : "+alamat.get(4));
                }else {
                    System.err.println("Data Tidak Ada!");
                }
            } else if (pilih == 4) {
                System.out.println("\nData Siswa");
                for (int i =0;i< nis.size();i++){
                    System.out.println(i +1+"."+ nis.get(i));
                }
                System.out.println("Masukan Nis Yang Akan Dihapus :");
                String Nis = input.next();
                nis.remove(Nis);
            }else {
                System.out.println("Menu Tidak Tersedia !");
            }

        }while (pilih !=5);


    }
}
