package Person;

public class PersonDetails {

    private String name;
    private String address;
    private String hobby;
    private String work;

    PersonDetails(String name, String address) {                //Constructor with basic Information
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHobby() {
        return hobby;
    }

    public String getWork() {
        return work;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    @Override
    public String toString() {
        return "This person's name is " + name +
                ", his address is, " + address +
                ", his hobby is " + hobby +
                " and he works at " + work;
    }
}
