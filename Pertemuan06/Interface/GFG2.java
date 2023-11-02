package Interface;

public class GFG2 {
    public static void main(String[] args){

        Bicycle bycl = new Bicycle();
        bycl.changeGear(2);
        bycl.speedUp(3);
        bycl.applyBrakes(1);

        System.out.println("Bicycle Present State:");
        bycl.printStates();

        Bike bk = new Bike();
        bk.changeGear(1);
        bk.speedUp(4);
        bk.applyBrakes(3);

        System.out.println("Bike Present State:");
        bk.printStates();
    }
}
