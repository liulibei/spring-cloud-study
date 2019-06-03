package cn.liulibei.eureka.feign;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyIRule {

    @Bean
    public IRule IRule(){
       return new BestAvailableRule();
    }

}
