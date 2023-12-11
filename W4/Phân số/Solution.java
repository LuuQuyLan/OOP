public class Solution {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
    * setDenominator.
    */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }             
        this.denominator = denominator;
    }

    /**
    * Constructor 1.
    */
    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    /**
     * Constructor 2.
     */
    Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * find gcd of 2 integer numbers.
     */
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    /**
     * simplified fraction of this.
     */
    Solution reduce() {
        int n = gcd(numerator, denominator);
        numerator = numerator / n;
        denominator = denominator / n;
        return this;
        
    }

    Solution add(Solution other) {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    Solution subtract(Solution other) {
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    Solution multiply(Solution other) {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    Solution divide(Solution other) {
        if (other.numerator == 0) {
            return this;
        }
        numerator = numerator * other.denominator;
        denominator = denominator * other.numerator;
        this.reduce();
        return this;
    }

    /**
    * check if two fraction is equal. 
    */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return true;
        }
        return false;
    }
}