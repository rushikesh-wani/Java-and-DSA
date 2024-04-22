import java.util.Scanner;

class CalcuatorUsingSwitch {

  public static void main(String[] args) {
    String yn;
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number:");
      int num1 = sc.nextInt();
      System.out.println("Enter second number:");
      int num2 = sc.nextInt();
      int res;
      System.out.println("Enter the operation (+ , - , * , /)");
      String operation = sc.next();
      switch (operation) {
        case "+":
          res = num1 + num2;
          System.out.println("Result: " + res);
          break;
        case "-":
          res = num1 - num2;
          System.out.println("Result: " + res);
          break;
        case "*":
          res = num1 * num2;
          System.out.println("Result: " + res);
          break;
        case "/":
          res = num1 / num2;
          System.out.println("Result: " + res);
          break;
        default:
          System.out.println("Invalid operation entered");
      }
      System.out.println(
        "Do you wat to continue... press Y to continue and N for no"
      );
      yn = sc.next();
    } while (yn.equals("y") || yn.equals("Y"));
  }
}
