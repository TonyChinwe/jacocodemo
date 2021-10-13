package com.phisoft.jacocodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMessages {

    @Test
    void testGreetingOne(){
      Messages messages=new Messages();
        Assertions.assertEquals("Hello tony",messages.getMessage("tony"));

    }

    @Test
    void testEmpty(){
        Messages messages=new Messages();
        Assertions.assertEquals("please enter your name",messages.getMessage(""));

    }

    @Test
    void testNull(){
        Messages messages=new Messages();
        Assertions.assertEquals("please enter your name",messages.getMessage(null));

    }
}
