package com.cybertek.tests.day11_propety_driver_faker;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class fakerTest {

@Test
    public void testOutJavaFaker(){

    Faker faker = new Faker();
    // what if you want random numbers in specific format like phone number
    // 111-111-1111
    System.out.println("faker.numerify(\"###-###-####\") = "
            + faker.numerify("###-###-####"));

}

}
