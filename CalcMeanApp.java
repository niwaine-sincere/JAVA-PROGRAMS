class CalcMean {

    int x1;
    int x2;
    int x3;

    // Parameterized constructor
    CalcMean(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    // Calculate mean
    double calcMean() {
        return (x1 + x2 + x3) / 3.0;
    }

    // Calculate variance
    double calcVariance() {
        double mean = calcMean();

        return (
            Math.pow(x1 - mean, 2) +
            Math.pow(x2 - mean, 2) +
            Math.pow(x3 - mean, 2)
        ) / 3.0;
    }

    // Calculate standard deviation
    double calcStandardDeviation() {
        return Math.sqrt(calcVariance());
    }

    // Find greatest value
    int getMax() {

        int max = x1;

        if (x2 > max) {
            max = x2;
        }

        if (x3 > max) {
            max = x3;
        }

        return max;
    }
}

public class CalcMeanApp {

    public static void main(String[] args) {

        // Create three CalcMean objects
        CalcMean object1 = new CalcMean(10, 20, 30);
        CalcMean object2 = new CalcMean(15, 25, 35);
        CalcMean object3 = new CalcMean(5, 10, 15);

        // Object 1
        System.out.println("===== OBJECT 1 =====");

        System.out.println("Mean: " + object1.calcMean());
        System.out.println("Variance: " + object1.calcVariance());
        System.out.println(
            "Standard Deviation: " +
            object1.calcStandardDeviation()
        );
        System.out.println("Greatest Value: " + object1.getMax());


        // Object 2
        System.out.println("\n===== OBJECT 2 =====");

        System.out.println("Mean: " + object2.calcMean());
        System.out.println("Variance: " + object2.calcVariance());
        System.out.println(
            "Standard Deviation: " +
            object2.calcStandardDeviation()
        );
        System.out.println("Greatest Value: " + object2.getMax());


        // Object 3
        System.out.println("\n===== OBJECT 3 =====");

        System.out.println("Mean: " + object3.calcMean());
        System.out.println("Variance: " + object3.calcVariance());
        System.out.println(
            "Standard Deviation: " +
            object3.calcStandardDeviation()
        );
        System.out.println("Greatest Value: " + object3.getMax());
    }
}