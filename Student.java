public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade() {
        double ans = (mScore*0.4) + (fScore*0.4)+20;
        if (ans >= 80) {
            System.out.println("Your Grade is A.");
        }
        else if ((ans >= 70) & (ans < 80)) {
            System.out.println("Your Grade is B.");
        }
        else if ((ans >= 60) & (ans < 70)) {
            System.out.println("Your Grade is C.");
        }
        else if ((ans >= 50) & (ans < 60)) {
            System.out.println("Your Grade is D.");
        }
        else {
            System.out.println("Your Grade is F.");
        }
    }
}
