package com.example.springproject.domain;

import com.example.springproject.interfaces.GardeningTool;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype")
@Profile("smallHouse")
public class LawnMower implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("Mowing the lawn");
    }
}
