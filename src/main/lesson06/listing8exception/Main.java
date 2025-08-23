package lesson06.listing8exception;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception: can not / by 0 ");
        }

        System.out.println("work next");

    }
}
