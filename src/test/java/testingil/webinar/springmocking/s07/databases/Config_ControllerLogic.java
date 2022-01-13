package testingil.webinar.springmocking.s07.databases;

import org.springframework.context.annotation.Bean;
import testingil.webinar.springmocking.RepositoryAdapter;
import testingil.webinar.springmocking.UserController;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;
import testingil.webinar.springmocking.UserRepository;

public class Config_ControllerLogic {
    @Bean
    public UserController userController(){
        return new UserController();
    }

    @Bean
    public UL_NotRequired userLogic(){
        return new UL_NotRequired();
    }

}
