public class Main {
    public static void main(String[] args) {

        System.out.println("Let's run FIbbonacci");
        FIbonacciLike Fibonacci = new FIbonacciLike(5, 2, 4);
        // 2 4 6 10 16
    Fibonacci.run();

        FIbonacciLike Fibonacci2 = new FIbonacciLike(7, -1, 2);
        // -1 2 1 3 4 7 11
        Fibonacci2.run();


    }
}