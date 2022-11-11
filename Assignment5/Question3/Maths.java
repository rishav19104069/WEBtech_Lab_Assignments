package CourseWork_PEC.Assignment5.Question3;

public class Maths extends Marks{
    double mathsMarks;

    public Maths(String name, double mathsMarks) {
        super(name, mathsMarks);
        this.mathsMarks = mathsMarks;
        Marks.totalMarks += mathsMarks;
        Marks.classTotalMarks += mathsMarks;
    }

}
