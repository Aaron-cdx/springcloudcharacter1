package com.duanxi.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHistrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi~" + name + ",the error is happening!";
    }
}
