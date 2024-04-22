// class SwapTwoNumber {

//   public static void main(String[] args) {
//     int a = 10, b = 20;
//     int t = a;
//     a = b;
//     b = t;
//     System.out.println(a);
//     System.out.println(b);
//   }
// }

// without using third variable

class SwapTwoNumber {

  public static void main(String[] args) {
    int a = 10, b = 20;
    System.out.println("Before Swap");
    System.out.println("a:" + a);
    System.out.println("b:" + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swap");
    System.out.println("a:" + a);
    System.out.println("b:" + b);
  }
}
