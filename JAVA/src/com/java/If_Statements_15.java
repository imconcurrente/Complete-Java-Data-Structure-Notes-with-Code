package com.java;
 //If statement   IMP hai
//public class If_Statements_15 {
//     public static void main(String[] args) {
//         int temp = 32;
//         if (temp > 30) {
//             System.out.println("It's a hot day");
//             System.out.println("Drink water");
//         }
//         else if (temp>20)
//             System.out.println("Beautiful day");
//         else
//             System.out.println("Cold day");
//
//     }
//}


//SIMPLIFYING IF STATEMENT
//method-1 ----> beginner
public class If_Statements_15 {
    public static void main(String[] args) {
      int income = 120_000;
        boolean hasHighIncome; //---> isko bahar isliye liye kyuki compilation errror aa rha tha
        if (income> 100_000)
            System.out.println(hasHighIncome = true);
        else
            System.out.println(hasHighIncome = false);
    }
}

//method- 2  ---> improvement kiya
//      int income = 120_000;
//        boolean hasHighIncome = false;
//if (income> 100_000)
//    hasHighIncome = true;

//method- 3 ---> most elegant and professional
//  int income = 120_000;
//  boolean isHasHighIncome = (income > 100_000); //---> use parenthesis to look more clear or neat



//  method - 1,2,3 apko code ko kis tarah likhna aur kaise improve kr shkte ho yeh dikha rha h