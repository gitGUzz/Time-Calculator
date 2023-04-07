import java.util.Arrays;
import java.util.Scanner;
/*
    TODO:
        > scan an input of "xx:yy" and separate the ':'
        >  xx:yy must be
        > [0 1 2], where ':' is "1" and we calculate the values of "0" and 2"
 */
public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1 = sc.nextLine();

        String[] arrayTimeValues_1 = time1.split(":");

        System.out.println(Arrays.toString(arrayTimeValues_1));
        System.out.println(arrayTimeValues_1.length);
    }
}
