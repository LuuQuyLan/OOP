public class  Solution {
    public String printHello() {
        return "HelloWorld";
    }
    /**
     * The function helps to print out to console.
     */

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.printHello();
        System.out.println(result);
    }
}