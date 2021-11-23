package lesson06.listing2enum;

public enum Card
{
    VISA("UA80380850", "10.08.2020", 123, "BIN"),
    MASTER("UA8787098708", "12.11.2021", 456, "BEN");

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
