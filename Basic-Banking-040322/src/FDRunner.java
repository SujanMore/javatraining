import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FDRunner {

    private static final int ROWS = 6;
    private static final int COLUMNS = 5;

    static Scanner input = new Scanner(System.in);

    public static double[][] readInterestCSV() throws FileNotFoundException {
        double[][] numArray = new double[ROWS][COLUMNS];
        int row = 0;

        File file = new File("src\\FDInterestRate.txt");
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
            String[] line = input.nextLine().split(",");

            for(int j = 0; j < line.length; j++){
                numArray[row][j] = Double.parseDouble(line[j]);
            }
            row++;
        }

//        System.out.println(Arrays.deepToString(numArray));

        return numArray;
    }

    public static void savingAccountMenu(){
        ArrayList<SavingAccount> list = new ArrayList<>();

        while(true){
            System.out.println("        Saving Account       ");
            System.out.println("1. Enter Customer Details    ");
            System.out.println("2. Saving Operations         ");
            System.out.println("3. Print all Customers       ");
            System.out.println("     (Press -1 to Exit)      ");
            System.out.println("-----------------------------");

            int op = input.nextInt();
            input.nextLine();

            if(op == 1){
                list = savingAccountEntry();
            } else if(op == 2){
                searchSavingAccount(list);
            } else if(op == 3){
                printAllSavingAccount(list);
            } else{
                break;
            }
        }
    }

    private static void fixedDepositMenu(InterestTable table) throws InterruptedException {

        ArrayList<FDAccount> customerList;
        Scanner input = new Scanner(System.in);

        System.out.println("     Fixed Deposit Entry     ");
        System.out.println("1. Enter Customer Details    ");
        System.out.println("2. Print FD Interest Table   ");
        System.out.println("     (Press -1 to Exit)      ");
        System.out.println("-----------------------------");
        int fDOperation = input.nextInt();
        input.nextLine();

        if(fDOperation == 1){
            customerList = FixedDepositOperation(table);
            printAllFDAccount(customerList);
        } else if (fDOperation == 2){
            table.printTable();
        }
    }

    public static ArrayList<FDAccount> FixedDepositOperation(InterestTable table) throws InterruptedException {

        ArrayList<FDAccount> customerList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int step = 0, exit = 0;
        String name = "";
        double fDAmount = 0;
        int duration = 0;

        System.out.println("     Fixed Deposit Entry     ");
        System.out.println("   Enter Account Details     ");
        System.out.println("        (-1 to Exit)         ");
        System.out.println("-----------------------------");

        while(exit == 0){

            switch (step){

                case 0:
                    System.out.println("Enter Customer Name: ");
                    name = input.nextLine();
                    if(name.equals("-1")){
                        exit = 1;
                        break;
                    }else{
                        step++;
                    }
                    break;

                case 1:
                    System.out.println("Enter Principal Amount: ");
                    fDAmount = input.nextDouble();
                    input.nextLine();
                    if(fDAmount == -1){
                        exit = 1;
                        break;
                    } else if(fDAmount == 0){
                        System.out.println("Invalid Amount!!");
                        Thread.sleep(2000);
                    } else{
                        step++;
                    }
                    break;

                case 2:
                    System.out.println("Choose Duration: (In Months)");
                    duration = input.nextInt();
                    input.nextLine();
                    if(duration == -1){
                        exit = 1;
                        break;
                    } else if(duration == 0){
                        System.out.println("Invalid Duration!!");
                        Thread.sleep(2000);
                    }else{
                        step++;
                    }
                    break;

                case 3:
                    customerList.add(new FDAccount(name, fDAmount, duration,
                            table.getInterestRate(table.getPrincipalRange(fDAmount), table.getDurationRange(duration))));
                    System.out.println("Customers Count: " + customerList.size());
                    System.out.println("-----------------------------------");
                    step = 0;
                    break;
            }
        }

        return customerList;
    }

    public static void savingAccountOperation(SavingAccount account){

        BigDecimal amount;

        while(true){
            System.out.println("-----------------------------");
            System.out.println("Account: " + account.getName() + '.' +
                    " Balance: " + account.getBalance());
            System.out.println("-----------------------------");
            System.out.println("1. Deposit Amount            ");
            System.out.println("2. WithDraw Amount           ");
            System.out.println("     (Press -1 to Exit)      ");
            System.out.println("-----------------------------");

            int option = input.nextInt();
            input.nextLine();

            if(option == 1){
                System.out.println("Enter Deposit Amt: ");
                amount = input.nextBigDecimal();
                account.AmountDeposit(amount);
            } else if (option == 2){
                System.out.println("Enter WithDraw Amt: ");
                amount = input.nextBigDecimal();
                account.AmountWithDraw(amount);
            } else{
                break;
            }
        }
    }

    public static int searchSavingAccount(ArrayList<SavingAccount> savingList){

        int index = 0;

        System.out.println(" Search Customer Saving Acc. ");
        System.out.println("1. By Name                   ");
        System.out.println("2. By Mobile                 ");
        System.out.println("     (Press -1 to Exit)      ");
        System.out.println("-----------------------------");
        int option = input.nextInt();
        input.nextLine();

        if(option != -1 ){
            if(option == 1){
                System.out.println("Enter Name: ");
            } else if(option == 2){
                System.out.println("Enter Mobile: ");
            }
            String search = input.nextLine();

            for(int i = 0; i < savingList.size(); i++){

                SavingAccount account = savingList.get(i);

                if(option == 1){
                    if(account.getName().equals(search)){
                        savingAccountOperation(savingList.get(i));
                    }
                } else if(option == 2){
                    if(account.getMobile().equals(search)){
                        savingAccountOperation(savingList.get(i));
                    }
                }
            }
        } else{
            return 0;
        }

        return 0;
    }

    public static void printAllFDAccount(ArrayList<FDAccount> depositList){

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("                                 FIXED DEPOSIT ACCOUNT LIST                                            ");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15S", "CUST. NAME", "DURATION", "PRINCIPAL AMT", "INTEREST RATE", "INTEREST AMT", "TOTAL AMT");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");

        DecimalFormat df = new DecimalFormat("#,###.00");
        for(FDAccount list: depositList){
            System.out.printf("%15s %8d Months %15s %15s %15s %15s", list.getName(), list.getDuration(),
                    df.format(list.getPrincipalAmount()), df.format(list.getInterestRate()), df.format(list.getInterestAmount()), df.format(list.getTotalAmount()));
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    public static void printAllSavingAccount(ArrayList<SavingAccount> savingList){

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("                                    SAVING ACCOUNT LIST                                                ");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s", "CUST. NAME", "MOBILE NO.", "DEPOSIT AMT", "WITHDRAW AMT", "BALANCE AMT");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");

        DecimalFormat df = new DecimalFormat("#,###.00");
        for(SavingAccount list: savingList){
            System.out.printf("%15s %15s %15s %15s %15s", list.getName(), list.getMobile(),
                    df.format(list.getDepositAmount()), df.format(list.getWithDrawAmount()), df.format(list.getBalance()));
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    public static ArrayList<SavingAccount> savingAccountEntry(){

        ArrayList<SavingAccount> list = new ArrayList<>();

        int step = 0, exit = 0;
        double balance = 0;

        System.out.println("    Saving Account Entry     ");
        System.out.println("   Enter Account Details     ");
        System.out.println("        (-1 to Exit)         ");
        System.out.println("-----------------------------");

        while(true){

            System.out.println("Enter Customer Name: ");
            String name = input.nextLine();
            if(!name.equals("-1")){
                System.out.println("Enter Mobile No. :");
                String mobile = input.nextLine();

                if(!mobile.equals("-1")){
                    System.out.println("Enter Amount (Opening Balance): ");
                    BigDecimal amount = input.nextBigDecimal();
                    input.nextLine();

                    if (amount.compareTo(BigDecimal.valueOf(0)) > 0){
                        list.add(new SavingAccount(name, mobile, amount));
                        savingAccountOperation(list.get(list.size() - 1));
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return list;
    }


    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        InterestTable table = new InterestTable(readInterestCSV());

        ArrayList<SavingAccount> savingList;

        Scanner input = new Scanner(System.in);

        System.out.println("   Choose Banking Operation  ");
        System.out.println("1. Saving Account            ");
        System.out.println("2. Fixed Deposit             ");
        System.out.println("     (Press -1 to Exit)      ");
        System.out.println("-----------------------------");
        int operation = input.nextInt();

            input.nextLine();

            if(operation == 1){
                savingAccountMenu();

            } else if(operation == 2){
                fixedDepositMenu(table);
        }
    }
}
