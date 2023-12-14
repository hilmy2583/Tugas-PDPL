package Pertemuan08.BassicPattern;

// import java.lang.reflect.Constructor;

public class ImmuTable {
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private final String address;
    // private final Car car;

    // Constructor
    public ImmuTable(String fn, String ln, String ssn, String addr){
        firstName = fn;
        lastName = ln;
        SSN = ssn;
        address = addr;
        // car = c;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSSN(){
        return SSN;
    }

    public String getAddress(){
        return address;
    }

    // public Car getCar(){
    //     return (Car) car.clone();
    // }
}
