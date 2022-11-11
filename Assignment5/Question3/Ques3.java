package CourseWork_PEC.Assignment5.Question3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of students : ");
        int n = sc.nextInt();
        int i = n;
        while (i>0) {
            System.out.print("Name of student number " + n + " : ");
            String name = sc.next();
            System.out.print("Physics marks : ");
            double phyMarks = sc.nextInt();
            System.out.print("Maths marks : ");
            double mathMarks = sc.nextInt();
            System.out.print("chemistry marks :");
            double chemMarks = sc.nextInt();
            new Physics(name, phyMarks);
            new Maths(name, mathMarks);
            Chemistry ch = new Chemistry(name, chemMarks);
            ch.displayTotalMarks();
            i--;
        }
       double avgMarks =  (Marks.ClassTotalMarks())/n;
        System.out.println("Avg marks of the class are " + avgMarks);
    }
}
