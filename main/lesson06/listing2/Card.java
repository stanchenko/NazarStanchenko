package lesson06.listing2;

public enum Card
{
    VISA("Number", "date", 123, "BIN");
    //MASTER("Number", "date", 123, "BIN");



    String number;
    String date;
    int cvv;
    String bin;

    Card(String number, String date, int cvv, String bin) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.bin = bin;
    }
}
