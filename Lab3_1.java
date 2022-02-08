
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_1 {

    public static void main(String[] args) {
        int line = 0;
        for (int i = 0; line < 100; i++) {

            if (Prime(i) && Palin(i)) {
                System.out.print(i + " ");
                line++;
                if (line % 10 == 0 && i != 0) {
                    System.out.println();
                }

            }

        }
    }

    public static boolean Prime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int trans(int number) {

        int trans = 0;
        while (number != 0) {

            trans *= 10;
            trans += number % 10;
            number /= 10;
        }

        return trans;
    }

    public static boolean Palin(int number) {

        return (number == trans(number));
    }

}
