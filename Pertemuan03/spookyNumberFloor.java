package Pertemuan03;
import java.util.Scanner;

public class spookyNumberFloor {
    public static void main(String args[]){
        String nama, nim, prodi;
        int floor;

        Scanner hotel = new Scanner(System.in);

        System.out.println("*Hotel Memiliki 17 Lantai.*");
        System.out.println("Mohon Isi Data Berikut: ");
        System.out.print("Nama Mahasiswa : ");
        nama = hotel.nextLine();
        System.out.print("NIM Mahasiswa  : ");
        nim = hotel.nextLine();
        System.out.print("Prodi Mahasiswa: ");
        prodi = hotel.nextLine();
        System.out.print("Lantai Tujuan  : ");
        floor = hotel.nextInt();

        System.out.println("======================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Prodi: " + prodi);

        int i = floor;

        if(i > 0 && i < 13){
            System.out.println("Pilih Tombol " + i);
        }
        else if(i < 18){
            int floors = i + 1;
            System.out.println("Pilih Tombol " + floors);
        }
        else{
            System.out.println("Tidak Ada Lantai Yang Anda Tuju.");
        }
        hotel.close();
        // String nama, nim, prodi;
        // nama = "Muhammad Hilmy";
        // nim = "0110222208";
        // prodi = "TI09";
        // System.out.println("Nama Saya: " + nama);
        // System.out.println("NIM : " + nim);
        // System.out.println("Saya merupakan mahasiswa " + prodi);
        // for(int i = 1; i < 18; i++){
        //     if(i > 0 && i < 13){
        //         System.out.println("Jika Anda ingin menuju lantai " + i + " Pilih Tombol " + i);
        //     }
        //     else if(i > 0 && i < 18){
        //         int floor = i + 1;
        //         System.out.println("Jika Anda ingin menuju lantai " + i + " Pilih Tombol " + floor);
        //     }
        //     else{
        //         System.out.println("Tidak Ada Lantai Yang Anda Tuju.");
        //     }
        // }
    }
}
