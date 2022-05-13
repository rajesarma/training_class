package com.sarma.rs.spring_related;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QualifierDemo1 {

    private calculator calculator;

    public QualifierDemo1(
            calculator calculator) {
        this.calculator = calculator;
        log.info(calculator.toString());
    }
}
