package testingil.webinar.springmocking.s02.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;

@Configuration
public class Config_RequiredRepositoryUL {
    @Bean
    public UL_RequiredRepository ul_requiredRepository(){
        return new UL_RequiredRepository();
    }
}
