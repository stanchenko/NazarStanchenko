package lesson06.listing9exception;

public class Main {

    public static void main(String[] args) throws CustomException {

        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new CustomException();
        }

        System.out.println("work next");

    }
}

