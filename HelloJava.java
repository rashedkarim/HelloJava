import lib.Student;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java World!!");
        /* for(int i = 0; i<10; i++){
            System.out.println("SL - "+i);
        } */

        Student student = new Student(1, "Golam");

        System.out.println(student.toString());
    }
}