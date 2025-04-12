package Hust.AbstractAndInheritance.Ex2;

public abstract class Animal implements CanMove {
    protected String name;
    public Animal() {}
    public Animal(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void run();
}
