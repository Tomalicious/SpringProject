package com.example.springproject;

import com.example.springproject.interfaces.CleaningService;
import com.example.springproject.interfaces.DomesticService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HouseApp {
    public static void main(String[] args){

        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()){

            ctx.getEnvironment().setActiveProfiles("bigHouse");
            ctx.register(AppConfigAnnotations.class);
            ctx.register(MyConfig.class);
            ctx.refresh();
            DomesticService service1 = ctx.getBean("domesticService" , DomesticService.class);
            service1.runHousehold();
            DomesticService service2 = ctx.getBean("domesticService" , DomesticService.class);
            service2.runHousehold();
            CleaningService service3 = ctx.getBean("cleaningService" , CleaningService.class);
            service3.clean();



        }
    }
}
