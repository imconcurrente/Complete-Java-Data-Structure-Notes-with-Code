package com.java.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
            String name = "Kunal";
            throw new MyException("name is kunal");
        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){   // first ArithmeticException and then Exception like this order will follow
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(" normal exception");
        } finally { // finally keyword only be created once!
            System.out.println("this will always execute");
        }
    }

   static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
// here we've learnt 5 new keyword
// 1. try
// 2. catch
// 3. finally -
// 4. throws - used to declare the exceptions
// 5. throw - throwing an exceptions
