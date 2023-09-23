import java.util.Scanner;
class master
  {
    public static void main(String[] args)
    {
      Double num;
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a Number");
      num = sc.nextDouble();
      Double square = num*num;
      System.out.println("The value od Square is :" + square);
    }
  }
