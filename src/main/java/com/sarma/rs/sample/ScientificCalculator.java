package com.sarma.rs.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//@Primary
public class ScientificCalculator implements calculator{
    @Override
    public int add(int a, int b) {
        log.info("In Sci Calc add method");
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        log.info("In Sci Calc sub method");
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        log.info("In Sci Calc mul method");
        return 0;
    }

    @Override
    public int div(int a, int b) {
        log.info("In Sci Calc div method");
        return 0;
    }

}
