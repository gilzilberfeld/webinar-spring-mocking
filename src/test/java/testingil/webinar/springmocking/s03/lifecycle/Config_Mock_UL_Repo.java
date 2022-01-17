package testingil.webinar.springmocking.s03.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.mockito.Mockito.mock;

@Configuration
class Config_Mock_UL_Repo {
    @Bean
    public UL_RequiredRepository ul_requiredRepository(){
        return mock(UL_RequiredRepository.class);
    }

    @Bean
    public UserRepository userRepository(){
        return mock(UserRepository.class);
    }
}
