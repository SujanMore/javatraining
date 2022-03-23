/*
Purpose of this exercise is to just understand the concepts of
encapsulation and creating methods inside a class.

Dummy methods are created for this purpose.

*/

package OnlineShopping;

public class OnlineShoppingRun {
    public static void main(String[] args) {

        OnlineShopping vinit = new OnlineShopping("Vinit", "Kandivali East");
        OnlineShopping sujan = new OnlineShopping("Sujan", "Borivali West");

        sujan.login();
        sujan.addItem();

        vinit.login();
        vinit.addItem();

        sujan.removeItem();

        sujan.logout();
        vinit.logout();

    }
}
