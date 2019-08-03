package com.duanxi.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务的生成者在注册中心中注册的名字
 *
 * 当使用断路器的时候，需要改造service，此时需要添加fallback
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHistrix.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
