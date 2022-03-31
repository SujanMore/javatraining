package Generics;

public class GenericsRunner {
    public static void main(String[] args) {

//        System.out.println("-----Enter Type------");
//        System.out.println("1. String");
//        System.out.println("2. Integer");
//        System.out.println("---------------------");
//        Scanner input = new Scanner(System.in);
//        int type = Integer.parseInt(input.nextLine());
//
//        if(type == 1){
//            GenericList<String> genericList = new GenericList<String>();
//        } else if(type == 2){
//            GenericList<Integer> genericList = new GenericList<Integer>();
//        }

        GenericList<String> stringList = new GenericList<>();

        stringList.addElement("String 1");
        stringList.addElement("String 2");
        stringList.addElement("String 3");
        System.out.println(stringList.getElement(2));
        System.out.println(stringList);

        System.out.println(" ");

        GenericList<Double> doubleList = new GenericList<>();
        doubleList.addElement(234.55);
        doubleList.addElement(1.4);
        System.out.println(doubleList.getElement(1));
        System.out.println(doubleList);

    }
}
