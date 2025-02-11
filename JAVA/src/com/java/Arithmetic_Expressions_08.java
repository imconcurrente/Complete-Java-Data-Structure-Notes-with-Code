package com.java;

//public class Arithmetic_Expressions_08 {
//    public static void main(String[] args) {
//       double ans = (double)10 / (double)3;  //double is used for have a decimal
//        System.out.println(ans);
//       // In arithmetic expression there are+,-,*,/
//       // In division ans always will be a whole no.
//    }
//}

//public class Arithmetic_Expressions_08{
//    public static void main(String[] args) {
//        int x = 1;
//        x++;
//        //or ++x; // ---> increment operator likewise we've decrement operator
//        System.out.println(x);
//    }

//public class Arithmetic_Expressions_08{
//    public static void main(String[] args) {
//        int x= 1;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);
//    }
//}

//public class Arithmetic_Expressions_08{
//    public static void main(String[] args) {
//        int x = 1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);
//    }
//}

//public class Arithmetic_Expressions_08{
//    public static void main(String[] args) {
//        int x = 1;
////       x = x+2;    // ---> other way to write this
//        x+= 2;    // try this also x-,x*,x/
//       // above is known as augmented or compound assignment
//        System.out.println(x);
//       }
//}


//try this question
public class Arithmetic_Expressions_08 {
    public static void main(String[] args) {
//        int x = 10+3*2;   //ans is 16 but how becoz of priority
        int x = (10+3) * 2;
        System.out.println(x);
    }
}

//   IMP--->   Order of operators
//      1. ()
//      2. */
//      3. +-
