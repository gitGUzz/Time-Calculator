import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  input
        String time1 = sc.nextLine();
        System.out.println("=======");
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

        for (int i = 0; i < stringArrayTimeValues_1.length; i++) {
            arrTime1[i] = Integer.parseInt(stringArrayTimeValues_1[i]);
            time1Minutes_Int = arrTime1[i];
        }

        for (int i = 0; i < stringArrayTimeValues_2.length; i++) {
            arrTime2[i] = Integer.parseInt(stringArrayTimeValues_2[i]);
            time2Minutes_Int = arrTime2[i];
        }

        System.out.println(time1Hours_Int);
        System.out.println(time2Hours_Int); //TODO: loop 0 for hours and 1 for minutes; minutes are looped with last iteration of i

        System.out.println(time1Minutes_Int);
        System.out.println(time2Minutes_Int);

    }
}
