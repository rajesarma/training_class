package com.sarma.rs.sample;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class TempService {

//    @Autowired
    private TempRepository tempRepository;

    /*public TempService(TempRepository tempRepository) {
        log.info("In Temp Service class");
        this.tempRepository = tempRepository;
    }*/

    @Autowired
    public void setTempRepository(TempRepository tempRepository) {
        this.tempRepository = tempRepository;
    }
}
