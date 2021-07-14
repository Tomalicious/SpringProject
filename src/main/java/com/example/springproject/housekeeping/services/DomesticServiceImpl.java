package com.example.springproject.housekeeping.services;

import com.example.springproject.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service("domesticService")
@Profile("bigHouse")
public class DomesticServiceImpl implements DomesticService {
    private Logger logger;

    private CleaningService cleaningService;

    private GardeningService gardeningService;

    @Autowired
    public DomesticServiceImpl(Logger logger, CleaningService cleaningService, GardeningService gardeningService) {
        this.logger = logger;
        this.cleaningService = cleaningService;
        this.gardeningService = gardeningService;
    }

    @Override
    public void runHousehold() {
        logger.info("HetMARCHEERT");
        cleaningService.clean();
        gardeningService.garden();
    }
}
