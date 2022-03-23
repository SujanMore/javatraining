/*
A basic exercise for creating a class for person details
and create objects with instance variable that are related to
a person

 */

package Person;

public class PersonRun {
    public static void main(String[] args) {

        PersonDetails sujan = new PersonDetails("Sujan", "Kandivali - East");

        sujan.setHobby("Listening to music");
        sujan.setWork("idigicloud");

        System.out.println(sujan);
        System.out.println("");
        sujan.eat();
        sujan.sleep();

    }
}
