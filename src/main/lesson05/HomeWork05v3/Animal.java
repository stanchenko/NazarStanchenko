package lesson05.HomeWork05v3;

public class Animal implements Info{
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void showInfo(){
        System.out.println("Id is "+this.id);
    }


}
