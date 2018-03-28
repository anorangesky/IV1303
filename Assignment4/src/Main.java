public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(i + 1 + ": " + Assignment4.Fib.fib(i));

            System.out.println("Isn't Fibonacci the best calculator ever? And so are you, so what is " + n + "divided by 3?");
        }

        System.out.println(simpleLogicCalc(args));


    }
}
