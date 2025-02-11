package com.java.enumExamaples;

public class Basic{
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, hello;
//        these are enum constants
//        public, static and final
        // since its final you can create child enums
        // type is week

        Week() {
            System.out.println("Constructor called for" + this);
        }
        // this is not public or protected, so only private or default
        //why? we don't want to create new objects
        //because this is not the enum concept, that's why
        // internally it is working like this: public static final Week Monday = new Week();


        @Override
        public void hello() {
            System.out.println("hey how are you");
        }

    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        System.out.println(week);

//        for( Week day : Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal()); // ordinal gives a simple index number
    }
}
