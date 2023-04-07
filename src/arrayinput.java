import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1 = sc.nextLine();

        String[] values_1 = new String[1];
        values_1 = time1.split(",");

        for (int i = 0; i < values_1.length; i++) {
            System.out.println(time1);
        }
    }
}
