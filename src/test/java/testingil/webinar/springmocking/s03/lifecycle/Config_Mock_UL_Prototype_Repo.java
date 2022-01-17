package testingil.webinar.springmocking.s03.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.mockito.Mockito.mock;

@Configuration
public class Config_Mock_UL_Prototype_Repo {
    @Bean
    @Scope("prototype")
    public UL_RequiredRepository ul_normal(){
        return mock(UL_RequiredRepository.class);
    }
    @Bean
    public UserRepository userRepository(){
        return mock(UserRepository.class);
    }
}
