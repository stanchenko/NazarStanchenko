package lesson04.hwLesson04.details;

public class Engine {
    private int power;
    private String company;

    //Создаем геттеры и сеттеры

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // cоздаем конструктор
    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    // создаем метод toString

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
