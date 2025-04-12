package Hust.AbstractAndInheritance.Ex2;

public class Cat extends Animal implements CanEat,CanDrink {
    public void run(){
        System.out.println("Cat run");
    }
    public void back(){
        System.out.println("Cat back");
    }
    public void getVelocity(){
        System.out.println("Cat's velocity is 20km/h");
    }
    public void eat(){
        System.out.println("Cat eat");
    }
    public void drink(){
        System.out.println("Cat drink");
    }
}
