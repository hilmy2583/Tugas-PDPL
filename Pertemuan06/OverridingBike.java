public class OverridingBike {
    int speedlimit = 150;
}

class Honda3 extends OverridingBike {
    int speedlimit = 90;

    public static void main(String args[]){
        OverridingBike obj = new Honda3();
        System.out.println(obj.speedlimit);
        //output speedlimit adalah 150, karena yang dijalankan terlebih dahulu adalah class parent
    }
}