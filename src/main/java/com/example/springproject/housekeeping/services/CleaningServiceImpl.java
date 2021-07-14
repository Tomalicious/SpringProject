package com.example.springproject.housekeeping.services;

import com.example.springproject.interfaces.CleaningService;
import com.example.springproject.interfaces.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Service("cleaningService")
@Lazy
@Profile("smallHouse")
public class CleaningServiceImpl implements CleaningService {
    private CleaningTool tool;
    private float rate;
    private Logger logger;

    @Autowired
    public CleaningServiceImpl(CleaningTool tool, float rate, Logger logger) {
        this.tool = tool;
        this.rate = rate;
        this.logger = logger;
    }

    public CleaningServiceImpl() {

    }

    @Value("7")
    public void setRate(float rate) {
        this.rate = rate;
    }


    @Override
    public void clean() {
        logger.info("Cleaning the house ");
        tool.doCleanJob();
    }

    @PostConstruct
    public void init() {
        System.out.println("cleaning firm dispatched");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Heading back home");
    }
}
