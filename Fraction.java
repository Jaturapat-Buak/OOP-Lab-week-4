public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        double x = (double) topN / btmN;
        return String.format("%.2f", x);
    }
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            // Case 1: Same denominator
            this.topN += f.topN;
        } else {
            // Case 2: Different denominator
            this.topN = (this.topN * f.btmN) + (f.topN * this.btmN);
            this.btmN = this.btmN * f.btmN;
        }
}
}