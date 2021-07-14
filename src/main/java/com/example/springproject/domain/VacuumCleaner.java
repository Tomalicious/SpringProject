package com.example.springproject.domain;

import com.example.springproject.interfaces.CleaningTool;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype")
@Order(4)
public class VacuumCleaner implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("shfffff");
    }
}
