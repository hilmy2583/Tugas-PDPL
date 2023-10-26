public class javaRumus {
    public String name;
    public String nim;
    public String angkatan;

    public javaRumus() {
        this.name = "Muhammad Hilmy";
        this.nim = "0110222208";
        this.angkatan = "TI angkatan 2022";
    }

    public static void main(String[] args) {
        javaRumus mahasiswa = new javaRumus();

        System.out.println("Nama Saya: " + mahasiswa.name);
        System.out.println("NIM : " + mahasiswa.nim);
        System.out.println("Saya merupakan mahasiswa " + mahasiswa.angkatan);

        int a = 1;
        int b = 2;
        int y = 3;

        double c = Math.sqrt(a * a + b * b - ((2 * a * b) * Math.cos(y)));

        System.out.println("a = " + a + "\nb = " + b + "\ny = " + y);

        System.out.println("Nilai C = " + c);
    }
}
