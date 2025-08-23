package lesson05.HomeWork05v4;

public class Boy implements Player, Study {

    @Override
    public void play() {
        System.out.println("Я мальчик и я запускаю игру - ногой");
    }

    public void read(){
        System.out.println("Я мальчик и умею читать");
    }

}
