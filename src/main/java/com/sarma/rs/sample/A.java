package com.sarma.rs.sample;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    @Lazy
    public A(B b) {
        this.b = b;
    }
}
