package com.kamaathedj.SunnyDay.service;

import com.kamaathedj.SunnyDay.events.MyEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class AnotherService {

    @ApplicationModuleListener
    void on(MyEvent event){
        System.out.println(event.getMessage());
    }

}
