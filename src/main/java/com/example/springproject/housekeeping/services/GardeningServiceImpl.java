package com.example.springproject.housekeeping.services;

import com.example.springproject.interfaces.GardeningTool;
import com.example.springproject.interfaces.GardeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
@Lazy
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;
    private Logger logger;

    @Autowired
    public GardeningServiceImpl(Logger logger , GardeningTool tool) {
        this.tool = tool;
        this.logger = logger;
    }

    @Override
    public void garden() {
        logger.info("Dayum");
        tool.doGardenJob();
    }

    @PostConstruct
    public void init() {
        System.out.println("Gardening service preparing for work.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Gardening service cleaning up.");

    }
}
// ENKEL AUTOWIRED OFWEL BIJ CONSTRUCTOR OFWEL BIJ SETTER , GEEN 2KEER