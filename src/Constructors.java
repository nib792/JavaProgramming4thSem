class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 23;
        name = "myname";
    }

    public MyMainEmployee(String myName,int myID) {
        name = myName;
        id=myID;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setID(int i) {
        this.id = i;
    }

    public int getID() {
        return id;
    }

}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee emp1 = new MyMainEmployee();
        MyMainEmployee emp2 = new MyMainEmployee("MY name is parameterized constructor",12);
//        emp1.setID(22);
//        emp1.getID();
//        emp1.setName("rabin");
//        emp1.getName();
//        constructors get invoked automatically just after the creation of object of the class
        System.out.println(emp1.getID());
        System.out.println(emp1.getName());
//        no need to invoke explicitly using the constructors
//        it runs automatically cause its a constructor
        System.out.println(emp2.getName());
        System.out.println(emp2.getID());

    }
}
