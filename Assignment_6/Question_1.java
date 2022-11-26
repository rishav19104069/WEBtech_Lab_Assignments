package CourseWork_PEC.Assignment_6;

public class Question_1 {

    public static void divide(int a, int b){
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Divide by 0 is not possible!");
        }
    }

    public static void multiply(double a, double b){
        try{
        if (a*b != 0){
            System.out.println(a*b);
        }
        else{
            throw new ArithmeticException("Input cannot be 0");
        }}
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
            multiply(0, 34);
            divide(9, 0);
    }

}
