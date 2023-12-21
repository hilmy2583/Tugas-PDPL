package TugasAkhirKelompokPDPL.CobaBuilder;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        Scanner shape = new Scanner(System.in);
        System.out.print("Masukkan Panjang dari Bangun Datar: ");
        int panjang = shape.nextInt();
        System.out.print("Masukkan Lebar dari Bangun Datar: ");
        int lebar = shape.nextInt();        
        this.panjang = panjang;
        this.lebar = lebar;
        shape.close();
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}
