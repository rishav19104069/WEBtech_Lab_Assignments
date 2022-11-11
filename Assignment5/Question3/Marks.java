package CourseWork_PEC.Assignment5.Question3;

public class Marks {
    static int rollNo = 0 ;
    String name;
    double marks;

   static double totalMarks;
   static double classTotalMarks;

    public Marks(String name, double marks) {
        Marks.rollNo += 1;
        this.name = name;
        this.marks = marks;
    }

    void displayTotalMarks(){
        System.out.println("Total marks of " + name + " are " + totalMarks);
        totalMarks = 0;
    }
    static double ClassTotalMarks(){
        return classTotalMarks;
    }
}
