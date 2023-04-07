import java.util.Scanner;

public class timeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  input
        System.out.print("Time 1: ");
        String time1 = sc.nextLine();
        System.out.println("=======");
        System.out.print("Time 2: ");
        String time2 = sc.nextLine();

        //  removing ':'
        String[] stringArrayTimeValues_1 = time1.split(":");
        String[] stringArrayTimeValues_2 = time2.split(":");

        // parsing strings to ints
        int[] arrTime1 = new int[stringArrayTimeValues_1.length];
        int[] arrTime2 = new int[stringArrayTimeValues_2.length];

        int time1Hours_Int = 0;
        int time2Hours_Int = 0;

        int time1Minutes_Int = 0;
        int time2Minutes_Int = 0;

        int temp = 0;
        int counter = 0;

        int resultHours = 0;
        int resultMinutes = 0;


        for (int i = 0; i < stringArrayTimeValues_1.length; i++) {
            counter++;
            arrTime1[i] = Integer.parseInt(stringArrayTimeValues_1[i]);
            temp = arrTime1[i];
            if (counter == 1)
                time1Hours_Int = temp;

            if (counter == 2)
                time1Minutes_Int = temp;

            temp = 0; // reset
        }
        counter = 0; // reset from reaching 3
        for (int i = 0; i < stringArrayTimeValues_2.length; i++) {
            counter++;
            arrTime2[i] = Integer.parseInt(stringArrayTimeValues_2[i]);
            temp = arrTime2[i];
            if (counter == 1)
                time2Hours_Int = temp;

            if (counter == 2)
                time2Minutes_Int = temp;

            temp = 0; // reset
        }

        // check if the time is valid (120:46556)
        if (time1Hours_Int >= 0 && time1Hours_Int <= 23 && time2Hours_Int >= 0 && time2Hours_Int <= 23) {
            if (time1Minutes_Int >= 0 && time1Minutes_Int <= 59 && time2Minutes_Int >= 0 && time2Minutes_Int <= 59) {

                resultHours = time1Hours_Int - time2Hours_Int;
                resultMinutes = time1Minutes_Int - time2Minutes_Int;


                resultHours -= 23;
                resultMinutes -= 60;

                resultHours = Math.abs(resultHours);
                resultMinutes = Math.abs(resultMinutes);

                if (resultMinutes >= 60) {
                    resultMinutes = 0;
                    resultHours += 1;
                }

                System.out.printf("\n%d hours and %d minutes.", Math.abs(resultHours), Math.abs(resultMinutes));
            }
        } else {
            System.out.println("invalid time!");
        }

    }
}
