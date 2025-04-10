package Hust.OOP1;

//Write a declaration of a package containing two classes; square class; circle class with the appropriate
//attribute, and the appropriate get/set method
public class Square {
    private int length;
    private int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
    }
}
