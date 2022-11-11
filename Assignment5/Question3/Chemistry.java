package CourseWork_PEC.Assignment5.Question3;

public class Chemistry extends Marks{
    double chemistryMarks;

    public Chemistry(String name, double chemistryMarks) {
        super(name, chemistryMarks);
        this.chemistryMarks = chemistryMarks;
        Marks.totalMarks += chemistryMarks;
        Marks.classTotalMarks += chemistryMarks;
    }

}
