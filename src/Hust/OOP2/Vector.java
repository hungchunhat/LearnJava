package Hust.OOP2;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public Vector addition(Vector v) {
        return new Vector(getX() + v.getX(), getY()+ v.getY(), getZ() + v.getZ());
        // Class can access its private attribute, even if it from other object
        //return new Vector(x + v.x, y + v.y, z + v.z);
    }
    public Vector subtraction(Vector v) {
        return new Vector(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
    }
    public int scalarMultiplication(Vector v) {
        return getX() * v.getX() + getY() * v.getY() + getZ() * v.getZ();
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }

    public static void main(String[] args) {
        Vector v = new Vector(5, 5, 5);
        System.out.println(v.addition(new Vector(5, 5, 5)));
        System.out.println(v);
        System.out.println(v.subtraction(new Vector(4, 4, 4)));
        System.out.println(v);
        System.out.println(v.scalarMultiplication(new Vector(5, 5, 5)));
    }
}
