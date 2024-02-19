package com.example.springdemo;

import com.example.springdemo.domain.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitDemoTest {
    private Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown invoke");

    }

    @Test
    public void testSay() {
        assertEquals("Hello , Ivan", person.say("Ivan"));

    }
}
