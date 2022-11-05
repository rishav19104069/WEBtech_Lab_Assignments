package Assignment4;

import java.util.*;

// Q1 - Write a java code to create user define size vector and store some values till user
//      wants or vector is not full and display vector elements.

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of vector to be created: ");
        int n = sc.nextInt();
        Vector<String> newVector = new Vector<>(n);
        int i = 0;
        while(i<n)
        {
            System.out.print("Please enter the " + (i+1) + "th element: ");
            String s = sc.next();
            if(s.equals("end")){
                break;
            }
            else{
                i++;
                newVector.addElement(s);
            }
        }
        System.out.print("The vector is: ");
        for(int j = 0;j< newVector.size();j++){
            System.out.print(newVector.elementAt(j)+",");
        }
        System.out.println();
        System.out.println("Vector size : " + newVector.size() + " and Vector capacity : " + newVector.capacity());

    }
}
