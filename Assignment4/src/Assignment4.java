import java.lang.*;
public class Assignment4 {

   public static void simpleLogicCalc(int tal1, char operator, int tal2) {
//seems like .equals doesn't work ... ??? 
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
    //the four logic operations as functions
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