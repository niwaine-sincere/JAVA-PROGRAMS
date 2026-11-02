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