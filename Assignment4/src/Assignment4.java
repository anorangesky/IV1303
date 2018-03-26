import java.io.*;

public class Assignment4 {

    //This is just a test template
    public static class Fib{
        public static int fib(int n){
            if(n <= 1) return n;
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        int n = 10;
        int i;
        for (i = 0; i < n; i++){
            System.out.println(i+1 + ": " + Fib.fib(i));
        }
    }
}
