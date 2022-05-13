package com.sarma.rs.sample;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Data
public class TempController {

//    @Autowired
    private TempService tempService;

    /*
    public TempController(TempService tempService) {
      log.info("In Controller class");
      this.tempService = tempService;
    }*/

    @Autowired
    public void setTempService(TempService tempService) {
        this.tempService = tempService;
    }
}


// @Controller
// @RestController
// @Service
// @Repository

// @Component
// @Configuration