package TugasAkhirKelompokPDPL.CobaBuilder;

public abstract class BangunDatar {
    protected int luas;
    protected int keliling;

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    public abstract void hitungLuas();
    public abstract void hitungKeliling();
}
