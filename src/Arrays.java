public class Arrays {
    public static void main(String[] args) {
//        classroom of 5 students and to store the marks of them
//        to  store the marks of these 500 students
        int[] marks; //array declaration
        marks = new int[5]; //memory allocation
        int[] marks1 = new int[5];  //array declaration and memory allocation
        int[] marks2 = {1, 2, 3, 4, 5, 6}; //array declaration and initialization
        System.out.println(marks2.length);
        for (int i = 0; i < 6; i++) {
            System.out.println(marks2[i]);
        }

    }
}

