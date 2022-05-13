package com.sarma.rs.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QualifierDemo {

//    @Autowired
    private calculator calculator;

    public QualifierDemo(
//            @Qualifier("basicCalculator")
            calculator calculator) {
        this.calculator = calculator;
        this.calculator.add(10, 10);
        log.info(calculator.toString());
    }
}
