package com.java;

//public class Casting_09 {
//    public static void main(String[] args) {
//        // Implicit casting or automatic conversion.
//        //conversion // byte --> short --> int --> long --> float --> double
//       double x = 1.1;
//       double y = x + 2;
//        System.out.println(y);
//    }
//}

//public class Casting_09{
//    public static void main(String[] args) {
////        if we want integer without writing double in y variable
//        double x = 1.1;
//        int y = (int)x +2;
//        System.out.println(y);
//    }
//}

public class Casting_09 {
    public static void main(String[] args) {
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}

//Now if string x = "1.1";
//then we use the double y = Double.parseDouble(x) + 2;
//there is so many classes like Short.parseShort()
//                              Float.parseFloat() etc..