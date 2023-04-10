import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=========/=======================================\\======");
        System.out.println("========/TIME DIFFERENCE CALCULATOR 24-HOUR FORMAT\\======");
        System.out.println("=======/===========================================\\=======\n");


        //  input
        System.out.print("Time 1: ");
        String time1 = sc.nextLine();
        System.out.println("=======");
        System.out.print("Time 2: ");
        String time2 = sc.nextLine();

        //  removing ':'
        String[] stringATV1 = time1.split(":"); // "array time values"
        String[] stringATV2 = time2.split(":");

        // parsing strings to ints
        int[] aT1 = new int[stringATV1.length]; // "array time"
        int[] aT2 = new int[stringATV2.length];

        int H1_Int = 0; // "time(N)Hours_Int"
        int H2_Int = 0;

        int M1_Int = 0; // "time(N)Minutes_Int"
        int M2_Int = 0;

        int temp = 0;
        int counter = 0;

        int rH = 0; // "resultHours"
        int rM = 0; // "resultMinutes"


        // implementation string -> int
        for (int i = 0; i < stringATV1.length; i++) {
            counter++;
            aT1[i] = Integer.parseInt(stringATV1[i]);
            temp = aT1[i];
            if (counter == 1)
                H1_Int = temp;

            if (counter == 2)
                M1_Int = temp;

            temp = 0; // reset
        }
        counter = 0; // reset from reaching 3
        for (int i = 0; i < stringATV2.length; i++) {
            counter++;
            aT2[i] = Integer.parseInt(stringATV2[i]);
            temp = aT2[i];
            if (counter == 1)
                H2_Int = temp;

            if (counter == 2)
                M2_Int = temp;

            temp = 0; // reset
        }

        // check if the time is valid (120:46556)
        if (H1_Int >= 0 && H1_Int <= 23 && H2_Int >= 0 && H2_Int <= 23) {
            if (M1_Int >= 0 && M1_Int <= 59 && M2_Int >= 0 && M2_Int <= 59) {

                rH = H1_Int - H2_Int;
                rM = M1_Int - M2_Int;

                if (rH < 0) {
                    if (rM < 0) {
                        rM = 60 + rM;
                        rH--;
                    }
                    if (rM > 0) {
                        rM = 60 - rM;
                        rH++;
                    }
                }

                if (rH > 0) {
                    if (rM < 0) {
                        rM = 60 + rM;
                        rH--;
                    }
                    if (rM > 0) {
                        rM = 60 - rM;
                        rH++;
                        rH = 24 - rH;
                    }
                } // adding minutes changes output

                if (H1_Int > H2_Int) {
                    rH = 24 - rH;
                }

                System.out.printf("\nRESULTS:\n%d hours and %d minutes.\n" +
                                "%d minutes. ",
                        Math.abs(rH), Math.abs(rM), Math.abs((rH * 60) + rM));

                System.out.println();
            }
        } else {
            System.out.println("invalid time!");
        }
    }


}
