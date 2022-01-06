package testingil.webinar.springmocking.s04.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserController;

@Configuration
public class Config_ControllerOnly {
    @Bean
    public UserController userController(){
        return new UserController();
    }
}
