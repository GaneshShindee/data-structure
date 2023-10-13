
import java.util.*;
public class questionno1 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the first number:-");
      int a=sc.nextInt();
      System.out.println("Enter second number:-");  
      int b = sc.nextInt();
      System.out.println("Enter third number:-");
      int c = sc.nextInt();

      int average = printAverageNumber(a,b,c);
      System.out.println("your average no is:-"+average);
      System.out.println("Do you want to multiplied numbers of a b c:-");
      // String z= "yes";
      Scanner s =new Scanner(System.in);
      String y = s.next();
      int multiply = printMultiplication(a,b,c);

      if(y== "yes"){
        System.out.println(multiply);
      }
      else{
        System.out.println("thank you");
      };
      sc.close();
      s.close();
    }
    public static int printAverageNumber ( int a,int  b,int c) {
    int average =(a+b+c)/3;
    return average;   
    }
    public static int printMultiplication(int a,int b, int c) {
    int multiply = a*b*c;
    return multiply;
    }
}
