package TugasAkhirKelompokPDPL.CobaBuilder;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {
    private int jari;
    private int PI = 22 / 7;

    public Lingkaran() {
        Scanner shape = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari dari Bangun Datar: ");
        int jari = shape.nextInt();        
        this.jari = jari;
        shape.close();
    }

    @Override
    public void hitungLuas() {
        luas = PI * jari * jari;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * PI * jari;
    }
}
