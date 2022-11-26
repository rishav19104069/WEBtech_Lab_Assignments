package CourseWork_PEC.Assignment_6;

public class Question_2 {
    public static void addition(int a, int b){
        try{
            if (a>0 && b>0) {
                System.out.println(a + b);
            }
            else{
                throw new ArithmeticException("Input cannot be negative");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void subtraction(double a, double b){
        try{
            if (a>0 && b>0) {
                System.out.println(a - b);
            }
            else{
                throw new ArithmeticException("Input cannot be negative");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        addition(-1, 2);
        subtraction(4, -5);

    }
}
