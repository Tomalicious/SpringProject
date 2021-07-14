package com.example.springproject.domain;

import com.example.springproject.interfaces.CleaningTool;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype" , proxyMode = ScopedProxyMode.INTERFACES)
@Order(1)
@Primary
public class DisposableDuster implements CleaningTool {

    private Boolean used = false;

    @Override
    public void doCleanJob() {
        if(used){
            System.out.println("I'm already used. Please throw me away");
        }else {
            System.out.println("Wipe the dust away");
            used = true;
        }

    }
}
