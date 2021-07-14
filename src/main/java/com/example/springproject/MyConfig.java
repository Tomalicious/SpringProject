package com.example.springproject;

import com.example.springproject.domain.Broom;
import com.example.springproject.housekeeping.services.CleaningServiceImpl;
import com.example.springproject.interfaces.CleaningService;
import com.example.springproject.interfaces.CleaningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(lazyInit = true)
public class MyConfig {

}
