package DayFind;

public class DayFind {

    public static void main(String[] args) {

        String[] days = {"Sunday", "Monday", "Tuesday",
                        "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Day with longest name is ");

        String longestDay = "";
        for(String day: days){
           if(day.length() > longestDay.length()){
               longestDay = day;
           }
        }

        System.out.println(longestDay);

        System.out.println("");
        System.out.println("Days in Reverse: ");

        for(int i = days.length - 1;i >= 0; i--){
            System.out.println(days[i]);
        }
    }
}
