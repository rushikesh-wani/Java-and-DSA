// year should be completely divide by 400
// if year is divided by 4 the year is leap but year should not be completely divided by 100

// class leapYear {

//   public static void main(String[] args) {
//     int year = 2024;
//     if (year % 4 == 0) {
//       if (year % 100 == 0) {
//         if (year % 400 == 0) {
//           System.out.println("Year is leap year!");
//         } else {
//           System.out.println("Not a leap year!");
//         }
//       } else {
//         System.out.println("Year is leap year!");
//       }
//     } else {
//       System.out.println("Not a leap year!");
//     }
//   }
// }

class leapYear {

  public static void main(String[] args) {
    int year = 2024;
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      System.out.println("Year is leap year!");
    } else {
      System.out.println("Not a leap year!");
    }
  }
}
