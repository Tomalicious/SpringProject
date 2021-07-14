package com.example.springproject;

import com.example.springproject.domain.*;
import com.example.springproject.housekeeping.services.*;
import com.example.springproject.interfaces.*;
import org.springframework.context.annotation.*;

import java.io.RandomAccessFile;


@Configuration
public class AppConfig {

//    @Bean
//    @Lazy
//    public Broom broom(){
//        System.out.println("Broom created");
//        return new Broom();
//    }
//
//    @Bean
//    @Lazy
//    public Sponge sponge(){
//        System.out.println("Sponge created");
//        return new Sponge();
//    }
//
//    @Bean
//    public VacuumCleaner vacuum (){
//        System.out.println("Vacuum cleaner created");
//        return new VacuumCleaner();
//    }
//
//    @Bean
//    public DisposableDuster disposableDuster (){
//        System.out.println("Disposable duster created");
//        return new DisposableDuster();
//    }
//
//    @Bean
//    @Primary
//    public CleaningRobot cleaningRobot(){
//        System.out.println("Robot created");
//        return new CleaningRobot();
//    }
//
//    @Bean
//    public CleaningService jill(){
//        CleaningServiceImpl cs = new CleaningServiceImpl();
//        cs.setCleaningTool(broom());
//        return cs;
//    }
//
//    @Bean
//    public CleaningService patricia(){
//        CleaningServiceImpl cs = new CleaningServiceImpl();
//        cs.setCleaningTool(vacuum());
//        return cs;
//    }
//
//    @Bean
//    public CleaningService schanulleke(){
//        CleaningServiceImpl cs = new CleaningServiceImpl();
//        cs.setCleaningTool(broom());
//        return cs;
//    }
//
//    @Bean
//    public CleaningService scotty(){
//        CleaningServiceImpl cs = new CleaningServiceImpl();
//        cs.setCleaningTool(disposableDuster());
//        return cs;
//    }

//    @Bean
//    public GardeningTool lawnMower(){
//        return new LawnMower();
//    }
//
//
//
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public GardeningService tom() {
//        GardeningServiceImpl gs = new GardeningServiceImpl();
//        gs.setGardeningTool(lawnMower());
//        return gs;
//
//    }
//
//    @Bean
//    @Primary
//    public DomesticService allroundService() {
//        DomesticServiceImpl ds = new DomesticServiceImpl();
//        ds.setCleaningService(schanulleke());
//        ds.setGardeningService(tom());
//        return ds;
//    }
}
