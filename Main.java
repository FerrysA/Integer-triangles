
import java.util.Random;
import java.util.Scanner;// библ для ввода с клавиатуры

public class Main {

    public static int giveTriang(int per) {
        int a = 1;
        int b = 1;
        double c = 1;
        int n = 0;

        for (; a + b + c <= per; a++) {
            for (b = a; a + b + c <= per; b++) {
                c = Math.sqrt(a * a + b * b + a * b);
                if ((c - (int) c) == 0) {
                    n++;
                    System.out.println(a + " " + b + " " + c);
                }
            }
            b = a;
        }
        return n;
    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {
        System.out.println(giveTriang(50));


    }
}

