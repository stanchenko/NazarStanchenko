package lesson06.listing2enum;

public class Main {
    public static void main(String[] args) {

        int svv1 = Card.VISA.cvv;
        String numberMaster = Card.MASTER.number;
        System.out.println(svv1);
        System.out.println(numberMaster);
    }
}
