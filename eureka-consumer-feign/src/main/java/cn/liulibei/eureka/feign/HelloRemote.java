package cn.liulibei.eureka.feign;

import cn.liulibei.eureka.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote  {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name")String name);

}
