package com.example.springproject.domain;

import com.example.springproject.interfaces.CleaningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
@Order(2)
@Qualifier("broom")
@Profile("smallHouse")
public class Broom implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("swish , swoosh");
    }
}
