
class myEmployee {
    private int id;
    private String name;

    public String getName() {
        name = "rabin";
        return name;
    }

    public void setId(int a) {
        id = a;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
//        getter is responsible for returning
//        and setter is responsible for setting the values infact it
//        wont return anything
        myEmployee E1 = new myEmployee();
        System.out.println(E1.getName());
        E1.setId(22);


    }
}
