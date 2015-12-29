/**
 * Created by Кирилл on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.printf("");
        System.out.println("Main.main");
        System.out.println("args = " + args);

        printTest(100);
    }

    public static void printTest(int x) {
        System.out.println("Main.printTest");
        System.out.println("x = " + x);

    }
}
