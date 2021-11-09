package lesson04.professions;

public class Person
{
    private int age;
    private String fullName;

    //генерим геттеры и сеттеры


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Генерим конструктор с параметрами age и fullName

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    // Генерим метод toString

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
