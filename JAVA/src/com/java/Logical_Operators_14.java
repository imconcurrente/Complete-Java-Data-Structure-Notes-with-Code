package com.java;

//public class Logical_Operators_14 {
//    public static void main(String[] args) {
//        // &&---> AND logical operator
//        int temperature = 22;
//                boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
//    }
//}
     // || ---> OR logical operator
//     public class Logical_Operators_14{
//         public static void main(String[] args) {
//             boolean hasHighIncome = false;
//             boolean hasGoodCredit = true;
//             boolean isEligible = hasHighIncome || hasGoodCredit;
//             System.out.println(isEligible);
//         }
//     }

     // ! ---> NOT logical operator
     public class Logical_Operators_14 {
         public static void main(String[] args) {
             boolean hasHighIncome = false;
             boolean hasGoodCredit = true;
             boolean hasCriminalRecord = false;
             boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
           //  ! is use for not having CriminalRecord
             System.out.println(isEligible);
         }
     }