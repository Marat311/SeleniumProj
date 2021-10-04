package com.cybertek.tests.day9_Explicit_wait_singlton_properties;

public class Singleton {
    //We want this class to only create one object
    //we want to block creation of more than one object

    //Singlton is design pattern to have a class only generate one object
    //in order to achieve Singlton pattern
    //1. Private constructor
    //2. private static field with data type same as class
    //3. public getter methid for private field
    //to check if you have already created object
    //if not -- create object for the first time
    //if yes -- just use existing object


   // static String word = "my only value";
    //instance variable
    private static Singleton obj;
    private Singleton(){
    }

    public static Singleton getObj(){
        //if obj is not initially give value
        //and create object and give value
        if (obj==null) {
            System.out.println("Object is not been created yet, creating one now");
            obj = new Singleton();
            return obj;
        }else {
            System.out.println("You already have object, use that existing object");
            return obj;
        }
    }

}
