package CourseWork_PEC.Assignment5.Question1;

public class Ques1 {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        MarineAnimals marine = new MarineAnimals();
        //  BlueWhale whale = new BlueWhale();
        mammal.category();
        marine.category();
        // whale.category();
        // Java compiler cannot decide, which display method to use. To prevent such situation, multiple
        // inheritances is not allowed in java.
    }
}
