package Hust.Polymorphism.Ex1;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();
        //Using polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Dog animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
//        Animal animal4 = new Animal(); Error: Cant create an object for abstract class
        //Downcasting
        Dog dog2 = (Dog) animal2;//downCasting
        BigDog bigDog2 = (BigDog) animal3;//downCasting
        Dog dog3 = (Dog) animal3;
//        Cat cat2 = (Cat) animal2; //Error: Cant animal2 is not instanceOf Cat
        dog2.greeting();
        dog3.greeting();
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
