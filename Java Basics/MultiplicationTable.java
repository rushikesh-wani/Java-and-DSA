import java.util.*;

class MultiplicationTable {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "Enter the number to print the multiplication table of it"
    );
    int num = s.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
  }
}
