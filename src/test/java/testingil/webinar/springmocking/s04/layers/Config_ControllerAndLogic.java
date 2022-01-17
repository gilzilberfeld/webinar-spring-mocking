package testingil.webinar.springmocking.s04.layers;

import org.springframework.context.annotation.Bean;
import testingil.webinar.springmocking.UserController;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;

public class Config_ControllerAndLogic {
    @Bean
    public UserController userController(){
        return new UserController();
    }

    @Bean
    public UL_NotRequired userLogic(){
        return new UL_NotRequired();
    }

}
