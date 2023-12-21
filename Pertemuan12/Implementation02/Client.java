package Pertemuan12.Implementation02;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("nurulfikri.com");
            internet.connectTo("elena.nurulfikri.ac.id");
            internet.connectTo("abc.com");
            internet.connectTo("mtlnation.com");
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
