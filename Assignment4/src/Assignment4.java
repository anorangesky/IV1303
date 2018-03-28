import java.lang.*;
public class Assignment4 {

    //This is just a test template

   public static void simpleLogicCalc(args[]) {
       int tal1 = args[0];
       int tal2 = args[2];
       char operator = args[1];

       if (operator.equals("+")) {
           addition(tal1, tal2);
       } else if (operator.equals("-")) {
           subtraction(tal1, tal2);
       } else if (operator.equals("*")){
           multiplication(tal1, tal2);
       }else if(operator.equals("/")){
           division(tal1, tal2);
       }else throw Exception e;
   }

   public static int addition(int x, int y){
       return x + y;
   }
   public static int subtraction(int x, int y){
       return x-y;
   }
   public static int multiplication(int x, int y){
       return x*y;
   }
   public static float division(int x,int y){
       return x/y;
   }

}