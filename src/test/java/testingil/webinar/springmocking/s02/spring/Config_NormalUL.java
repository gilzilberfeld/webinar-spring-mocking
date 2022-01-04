package testingil.webinar.springmocking.s02.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserLogic.UL_Normal;

@Configuration
public class Config_NormalUL {
    @Bean
    public UL_Normal ul_normal(){
        return new UL_Normal();
    }
}
