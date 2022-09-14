package CourseWork_PEC;

public class LabAssignment1 {
    public static void main(String[] args) {

        // Question 1--------------------------------------
        System.out.println("Question 1");
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        int sub = num2 - num1;
        System.out.println("Sum of two numbers " + num2 + " and " + num1 + " = " + sum);
        System.out.println("Subtraction of two numbers " + num2 + " and " + num1 + " = " + sub);
        System.out.println();

        //Question 2--------------------------------------
        System.out.println("Question 2");
        float n1 = 6.3f;
        float n2 = 7.5f;
        float mul = (n1*n2);
        System.out.println("Multiplication of "+ n1 +" and "+n2 +" = " + mul);
        System.out.println();

        // Question 3--------------------------------------
        System.out.println("Question 3");
        double q = (double)num2/num1;
        double rem = (double)num2%num1;
        System.out.println("Quotient on dividing "+ num2 + " by " + num1 + " = " + q);
        System.out.println("Remainder on dividing "+ num2 + " by " + num1 + " = " + rem);
        System.out.println();

        // Question 4--------------------------------------
        System.out.println("Question 4");
        // with using temp variable
        System.out.println("Initially- " + "num1 = " + num1 +  " and " + "num2 = " +  num2);
        int var;
        var = num1;
        num1 = num2;
        num2 = var;
        System.out.println("After Swapping- " + "num1 = " + num1 +  " and " + "num2 = " +  num2);
        System.out.println();

        // without using temp variable
        System.out.println("Initially- " + "num1 = " + n1 +  " and " + "num2 = " +  n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After Swapping- " + "num1 = " + n1 +  " and " + "num2 = " +  n2);



    }
}
