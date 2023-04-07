import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int hours1 = Integer.parseInt(sc.next());
        System.out.print(':');
        int minutes1 = Integer.parseInt(sc.next());

        int hours2 = Integer.parseInt(sc.next());
        System.out.print(':');
        int minutes2 = Integer.parseInt(sc.next());

        boolean validTime = false;

        int resultHours = 0;
        int resultMinutes = 0;

        int NEWresultHours = 0;
        int NEWresultMinutes = 0;


        if (hours1 >= 0 && hours1 <= 23 && hours2 >= 0 && hours2 <= 23) {
            if (minutes1 >= 0 && minutes1 <= 59 && minutes2 >= 0 && minutes2 <= 59) {
                validTime = true;


                resultHours = hours1 - hours2;
                resultMinutes = minutes1 - minutes2;

                if(resultHours > 0 && resultMinutes > 0){
                    resultHours -= 23;
                    resultMinutes -= 60;
                }

                if(resultHours < 0 && resultMinutes < 0){
                    resultHours = Math.abs(resultHours);
                    resultMinutes = Math.abs(resultMinutes);
                }

                if(resultHours == 0 && resultMinutes == 0){
                    System.out.println("0 / 24 hours");
                }

                System.out.printf("%d hours and %d minutes.", resultHours, resultMinutes);
            }
        }


    }
}
