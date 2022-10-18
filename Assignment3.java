package CourseWork_PEC;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {
//        Q1 Write a java program to compare two strings lexicographically (without using library function).
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
        System.out.print("Enter a string - ");
        String str = in.next();

        char charArray[] = str.toCharArray();

        Arrays.sort(charArray);

        System.out.println("Sorted String: " + new String(charArray));

        System.out.println("--------------X---------------X---------------X---------------");

//        Q4 Write a ConsoleProgram that reads in a number from the user and then displays the Hailstone sequence for that number

        System.out.println("Enter a number - ");
        int n = in.nextInt();
        System.out.println(" The Sequence is - ");
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(1);

        System.out.println("--------------X---------------X---------------X---------------");

//      Q5 Print all possible ways to convert one string into another string. Given two strings str1 and str2, the task is to print the all possible ways to convert ‘str1’ into ‘str2’ using string inbuilt functions.

        System.out.println("-----Question 5-----");
        String string1 = "abcdef";
        String string2 = "axcdfdh";
        System.out.println("Steps to convert "+ string1+" to "+string2+" are : ");
        convertString(string1,string2);
        printWays(string1,string2,new ArrayList<String>());

    }

    static int dp[][];
    static ArrayList<ArrayList<String> > arrs = new ArrayList<ArrayList<String> >();


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

    //  DP matrix
    static void convertString(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] DP = new int[l1 + 1][l2 + 1];

        // initialize by the maximum edits possible
        for (int i = 0; i <= l1; i++)
            DP[i][0] = i;
        for (int j = 0; j <= l2; j++)
            DP[0][j] = j;

        // Compute the DP matrix
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {

                // if the characters are same no changes required
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    DP[i][j] = DP[i - 1][j - 1];
                else {

                    // minimum of three operations possible
                    DP[i][j] = min(DP[i - 1][j - 1],
                            DP[i - 1][j], DP[i][j - 1])
                            + 1;
                }
            }
        }

        // initialize to global array
        dp = DP;
    }
    // Function to find the minimum of three
    static int min(int a, int b, int c)
    {
        int z = Math.min(a, b);
        return Math.min(z, c);
    }

    static void printWays(String s1, String s2,
                          ArrayList<String> changes)
    {

        // Function to print all the ways
        printAllChanges(s1, s2, new ArrayList<String>());

        int i = 1;

        // print all the possible ways
        for (ArrayList<String> ar : arrs) {
            System.out.println("\nMethod " + i++ + " : \n");
            for (String s : ar) {
                System.out.println(s);
            }
        }
    }

    static void printAllChanges(String s1, String s2, ArrayList<String> changes)
    {

        int i = s1.length();
        int j = s2.length();


        while (true) {

            if (i == 0 || j == 0) {


                arrs.add(changes);// add to answer
                break;
            }

            // If same
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                i--;
                j--;
            }

            else {
                boolean if1 = false, if2 = false;

                // Replace
                if (dp[i][j] == dp[i - 1][j - 1] + 1) {

                    // Add this step
                    changes.add("Change " + s1.charAt(i - 1) + " to " + s2.charAt(j - 1));
                    i--;
                    j--;

                    // note whether this 'if' was true.
                    if1 = true;
                }

                // Delete
                if (dp[i][j] == dp[i - 1][j] + 1) {
                    if (if1 == false) {
                        changes.add("Delete " + s1.charAt(i - 1));
                        i--;
                    }
                    else {

                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);

                        // Remove last operation
                        changes2.remove(changes.size() - 1);

                        // Add this new operation
                        changes2.add("Delete " + s1.charAt(i));

                        // initiate new  instance of function with remaining substrings
                        printAllChanges(s1.substring(0, i), s2.substring(0, j + 1), changes2);
                    }

                    if2 = true;
                }

                // Add character step
                if (dp[i][j] == dp[i][j - 1] + 1) {
                    if (if1 == false && if2 == false) {
                        changes.add("Add " + s2.charAt(j - 1));
                        j--;
                    }
                    else {

                        // Add steps
                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);
                        changes2.remove(changes.size() - 1);
                        changes2.add("Add " + s2.charAt(j));

                        // Recursively call for the next steps
                        printAllChanges(s1.substring(0, i + 1),
                                s2.substring(0, j), changes2);
                    }
                }
            }
        }
    }
}