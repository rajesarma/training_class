package com.sarma.rs.sample;

import org.springframework.stereotype.Component;

@Component
public interface calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}
