public class rumusJava {
    public String name;
    public String angkatan;
    public rumusJava(){
        this.name = "Muhammad Hilmy";
        this.angkatan = "TI angkatan 2022";
    }
    public static void main(String[]args){
        rumusJava mahasiswa = new rumusJava();
        System.out.println("Nama Saya: " + mahasiswa.name);
        System.out.println("Saya merupakan mahasiswa " + mahasiswa.angkatan);
    }
}
