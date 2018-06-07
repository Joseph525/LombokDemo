package com.joseph.lombok;

import org.junit.Test;

/**
 * Created by Joseph on 2017/3/14.
 */
public class LombokTest {

    @Test
    public void testGetterSetter(){
        Student1 student = new Student1();
        student.setName("test");
        System.out.println(student.getName());
    }

    @Test
    public void testBuilder(){
        Student2 student = Student2.builder().age(10).name("test").build();
        System.out.println(student.toString());
    }
}

