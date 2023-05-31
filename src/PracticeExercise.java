class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class PracticeExercise {
    public static void main(String[] args) {
//        Problem 1:
//        Cylinder obj = new Cylinder();
//        obj.setRadius(22.2f);
//        obj.setHeight(13.3f);
//        System.out.println(obj.getHeight());
//        System.out.println(obj.getRadius());


//        Problem 2
        Cylinder obj2 = new Cylinder(22.2f, 13.3f);

        System.out.println("The volume obtained is " + obj2.volume());
        System.out.println("The area of cylinder is " + obj2.area());


//        problem 3
        Rectangle rect = new Rectangle(12, 13);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());


    }
}
