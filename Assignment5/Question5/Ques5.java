package CourseWork_PEC.Assignment5.Question5;

public class Ques5 {
    final static int x;

    static {
        x = 10;
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}

//  The output is 10 as the variable is final, so it should be declared when it is instanced
//  but as it is declared inside a static block which also executes at compile time this will work.
