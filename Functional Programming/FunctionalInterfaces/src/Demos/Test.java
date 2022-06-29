package Demos;

@FunctionalInterface
interface Cab {
    public String bookCab(String source, String destination);
}

//class Ola implements Cab {
//
//    @Override
//    public String bookCab(String source, String destination) {
//
//        System.out.println("Ola Cab is booked from " + source + " To " + destination);
//
//        return ("Price: 5000 Rs");
//    }
//}

public class Test {

    public static void main(String[] args) {

        Cab cab = (source, destination) ->{
            System.out.println("Ola Cab is booked from " + source + " To " + destination);
            return ("Price: 5000 Rs");
        };
        System.out.println(cab.bookCab("Hyd", "Mumbai"));
    }
}
