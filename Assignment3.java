package CourseWork_PEC;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        //Q1 Write a java program to compare two strings lexicographically (without using library function).
        Scanner in = new Scanner(System.in);
        System.out.print ("Enter First String - ");
        String str1 = in.next();
        System.out.print ("Enter Second String - ");
        String str2 = in.next();
        int ans = compare(str1, str2);
        System.out.println(ans);

        System.out.println("--------------X---------------X---------------X---------------");

//        Q2 Write a program to implement counting sort (with input in the range 0 to 20 and input can be repeated multiple times)
        countsort(in);

        System.out.println("--------------X---------------X---------------X---------------");

//        Q3 Write a program to sort strings (using library function).
    }


    public static int compare(String s1, String s2){
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if ((int) s1.charAt(i) == (int) s2.charAt(i)){
                continue;
            }
            else {
                return (int) s1.charAt(i) - (int) s2.charAt(i);
            }}
            if (s1.length() != s2.length()){
                return Math.abs(s1.length() - s2.length());
            }

            else{
                return 0;
            }
    }
    public static void countsort(Scanner in) {
        System.out.print("Plase enter the length of the array = ");
        int length = in.nextInt();
        int[] freq = new int[21];
        for (int j = 0; j < freq.length; j++) {
            freq[j] = 0;
        }
        int count = 0;
        while (count < length) {
            System.out.print("Please enter a number between 0 to 20 = ");
            int input = in.nextInt();
            if (input < 21){
                freq[input] += 1;
                count++;
            }
            else{
                System.out.println("Number should be between 0 and 20");
            }
        }
        int[] arr = new int[length];
        int i = 0;
        int j = 0;
        while (i < length) {
            while (freq[j] > 0){
                arr[i] = j;
                i++;
                freq[j]--;
            }
            j++;
        }
        System.out.print("Sorted array is = ");
        System.out.print(Arrays.toString(arr));
        return;





    }
}
