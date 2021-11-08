package hwLesson04.professions;

public class Driver extends Person
{

    private String name;
    private int experience;

    // Сгенерировали геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Сгенерировали конструктор

    public Driver(String name, int experience, int age, String fullName) {
        super(age, fullName);
        this.name = name;
        this.experience = experience;
    }

    // Сгенерили toString() метод


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}

