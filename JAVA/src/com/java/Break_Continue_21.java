package com.java;

import java.util.Scanner;

//public class Break_Continue_21 {
    //Yaha iss program ko run krne par quit jab enter krte h quit wapis likh ke aata hai
    //Usko reslove krna h
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (!input.equals("quit"))
//                System.out.println(input);
//        }
//    }
//}
//yaha upar wali problem reslove hogyi
//Iska ek aur way reslove krne ka woh h ---> break
//code mein sirf yeh krna h
//let me show u


//Break statement:
//public class Break_Continue_21 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//    }
//}
//IMP note: when java sees the break statement it will ignore
//everything else after & it will terminate the loop

//Continue statement:
//public class Break_Continue_21 {
//    public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
//String input = "";
//        while (!input.equals("quit")) {
//        System.out.print("Input: ");
//        input = scanner.next().toLowerCase();
//        if (input.equals("pass"))
//            continue;
//        if (input.equals("quit"))
//        break;
//        System.out.println(input);
//       }
//    }
// }

//IMP- Continue statement moves control to the beginning of a loop


//ek aur baat actually we don't need ---> while (!input.equals("quit"))
// for implementation of our code becozz phele se hi break statement laga
//hua h toh code ko aise improve kr shkte h but break statement hona zarruri h
//let me show u

//public class Break_Continue_21{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//        System.out.print("Input: ");
//        input = scanner.next().toLowerCase();
//        if (input.equals("pass"))
//            continue;
//        if (input.equals("quit"))
//            break;
//        System.out.println(input);
//       }
//    }
//}


//NOTE-remember if you're using while(true) make sure
// u have a break statement in you loop
