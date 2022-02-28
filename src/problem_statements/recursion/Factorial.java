package problem_statements.recursion;

public class Factorial {
    public long  calculateFactorial(int n) {
        //base case
        if (n == 1) {
            return 1;
        }
        // recursive relation
        return n * calculateFactorial(n-1);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.calculateFactorial(14));

    }
}
