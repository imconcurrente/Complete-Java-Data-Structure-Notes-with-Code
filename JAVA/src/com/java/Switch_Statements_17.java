package com.java;

//public class Switch_Statements_17{
////   implementing with If Statement
//    public static void main(String[] args) {
//       String role = "admin";
//       if(role == "admin")
//           System.out.println("You're an admin");
//       else if (role == "moderator")
//           System.out.println("You're a moderator");
//       else
//           System.out.println("You're a guest");
//    }
//}


//public class Switch_Statements_17{
//    public static void main(String[] args) {
//        String role = "admin";
//        //implementing by Switch Statement
//        switch (role){
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }
//    }
//}

// Now you can compare the if and switch statements
// and decide wht u want to prefer for further


//you're asking me what if the role is int then
//what to do let me show u in switch statement

public class Switch_Statements_17 {
    public static void main(String[] args) {
        int role = 1;

        switch (role) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");

        }
    }
}

