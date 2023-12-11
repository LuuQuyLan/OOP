public class Solution {
    private int numerator;
    private int denominator;

    // Constructor with parameters
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Invalid denominator. Setting denominator to 1.");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
        reduce(); // Reduce the fraction after initialization
    }

    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    // Setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    // Setter for denominator
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Invalid denominator. Denominator cannot be set to 0.");
        } else {
            this.denominator = denominator;
            reduce();
        }
    }

    // Helper method to find the greatest common divisor (GCD)
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Method to reduce the fraction to its simplest form
    private void reduce() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Method to add another fraction to this fraction
    public Solution add(Solution other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }

    // Method to subtract another fraction from this fraction
    public Solution subtract(Solution other) {
        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }

    // Method to multiply this fraction by another fraction
    public Solution multiply(Solution other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }

    // Method to divide this fraction by another fraction
    public Solution divide(Solution other) {
        if (other.numerator == 0) {
            System.out.println("Division by zero is not allowed. Returning the original fraction.");
            return this;
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Solution(newNumerator, newDenominator);
    }

    // Method to check if two fractions are equal
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return this.numerator == other.numerator && this.denominator == other.denominator;
        }
        return false;
    }

    // Method to return the string representation of the fraction
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Solution fraction1 = new Solution(2, 4);
        Solution fraction2 = new Solution(3, 6);

        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);

        Solution sum = fraction1.add(fraction2);
        System.out.println("Sum: " + sum);

        Solution difference = fraction1.subtract(fraction2);
        System.out.println("Difference: " + difference);

        Solution product = fraction1.multiply(fraction2);
        System.out.println("Product: " + product);

        Solution quotient = fraction1.divide(fraction2);
        System.out.println("Quotient: " + quotient);

        System.out.println("Are Fraction 1 and Fraction 2 equal? " + fraction1.equals(fraction2));
    }
}
