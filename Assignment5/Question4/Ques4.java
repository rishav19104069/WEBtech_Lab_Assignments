package CourseWork_PEC.Assignment5.Question4;

public class Ques4 {
    static int var = 20;
    Ques4() {
        var++;
    }
    void m1() {
        var++;
        System.out.println(var);
    }
    public static void main(String[] args)
    {
        Ques4 obj = new Ques4();
        Ques4 obj2 = new Ques4();
        Ques4 obj3 = new Ques4();
        obj3.m1();
    }
}

//  YES the output will be 24 as 'var' is a static variable so each time an object is crated
//  the constructor is called and as static variables are properties of class and not the object
//  it is not set to 20 each time but is incremented from its previous value hence it is incremented
//  by a total of 4 times.