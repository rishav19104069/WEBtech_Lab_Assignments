package CourseWork_PEC;

public class Assignment2 {
        public static void smallest(double a, double b, double c)
        {
            if(a<b){
                if(a<c) System.out.println("Smallest Number- " + a);
                else System.out.println("Smallest Number- " + c);
            }
            else{
                if(b<c) System.out.println("Smallest Number- " + b);
                else System.out.println("Smallest Number- " + c);
            }
        }
        public static void main(String args[]){
            // ----------------- Question 1 --------------------
            System.out.println("Question 1");
            double score = 89;
            System.out.println("Initially the score is " + score);
            if(score>=80 && score<=90){
                score+=5;
            }
            System.out.println("Latest Score is " + score);

            //----------------- Question 2 --------------------
            System.out.println("Question 2");
            double num1 = 52.9,num2 = 29.31,num3=124.44;
            smallest(num1,num2,num3);

            //----------------- Question 3 --------------------
            System.out.println("Question 3");
            int month = 11;
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Please enter between 1 to 12");
                    break;
            }

            //----------------- Question 4 --------------------
            System.out.println("Question 4");
            int pop = 80000;
            int years = 0;
            System.out.println("Initial Population - "+pop);
            while(pop<150000){
                pop += 0.05*pop;
                years++;
            }
            System.out.println("Population will exceed to 150000 for first time in " + years + " years");

            //----------------- Question 5 --------------------
            System.out.println("Question 5");
            int n = 5;
            System.out.println("n          n^2           n^3         n^4");
            for(int i = 1;i<=n;i++){
                int power1 = (int) Math.pow(i,2);
                int power2 = (int) Math.pow(i,3);
                int power3 = (int) Math.pow(i,4);
                System.out.println(i+"          "+power1+"            "+power2+"            "+power3);
            }

            //----------------- Question 6 --------------------
            System.out.println("Question 6");
            System.out.print("Multiples: ");
            int multiple = 3;
            do {
                System.out.print(multiple + "     " );
                multiple += 3;
            } while(multiple <= 36);
        }
    }
