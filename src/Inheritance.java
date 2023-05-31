class Animal {
    private int legs;
    private String nameA;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        System.out.println("Setting legs of animal");
        this.legs = legs;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }
}

class Dog extends Animal {
    public String bark() {
        String h = "Animal dog barks alot";
        return h;

    }

}

public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.setLegs(4);
        System.out.println("The animal has " + obj.getLegs() + " legs and the name of the animal is " + obj.getNameA() + " and " + obj.bark());


    }
}
