package com.cybertek.tests.day9_Explicit_wait_singlton_properties;

import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void testSingleton(){

     //   Singleton s1 = new Singleton();
     //   s1.word="abc";

        //Singleton s2 = new Singleton();
       // s2.word="efg";

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();


    }
}
