package com.joseph.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Student2 {
    private String name;
    private int age;
}
