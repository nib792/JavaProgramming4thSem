
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Typecasting in java using the concepts of narrowing and widening");
        System.out.println("Widening (automatic typecating)");
        System.out.println("small to large conversion so automatically the type will be casted");
        System.out.println("byte->short->char->int->long->float->double");
        int myInt = 10;
        double myDouble = myInt;//automatically detects the datatype and does the typecasing automaticallly
        System.out.println(myInt);//o/p 9
        System.out.println(myDouble);//o/p 9.0

        System.out.println("Narrowing in java");
        System.out.println("Narrowing (manual typecating)");
        System.out.println("large to small conversion so manually the type should  be casted");
        System.out.println("double->float->long->int->char->short->byte");

        double myDoub1 = 22;
        int myInt1 = (int) myDoub1;
        System.out.println(myDoub1);
        System.out.println(myInt1);
    }
}
