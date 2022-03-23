package OnlineShopping;

public class OnlineShopping {

        private String custName;
        private String custAddr;

        OnlineShopping(String name, String address){
            this.custName = name;
            this.custAddr = address;
        }

        public void login(){
            System.out.println(custName + " has logged in");
        }

        public void logout(){
            System.out.println(custName + " has logged out");
        }

        public void addItem() {
            System.out.println("Item added for " + custName);
        }

        public void removeItem(){
            System.out.println("Item removed for " + custName);
        }
}
