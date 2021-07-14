package com.example.springproject.domain;

import com.example.springproject.interfaces.CleaningService;
import com.example.springproject.interfaces.CleaningTool;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Component("robot")
@Scope(value = "prototype")
@Primary
@Profile("bigHouse")
public class CleaningRobot implements CleaningService {

    private List<CleaningTool> tools;

    @Autowired
    public CleaningRobot(List<CleaningTool> tools) {
        this.tools = tools;
    }

    public CleaningRobot() {
    }

    @Autowired
    public void setCleaningTools(List<CleaningTool> tools){
        this.tools = tools;
    }

    @Override
    public void clean() {
        System.out.println("cleaning the house");
        tools.forEach(CleaningTool::doCleanJob);
    }

    @PostConstruct
    public void init() {
        System.out.println("initialising cleaning robot");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Robot done working");
    }
}
