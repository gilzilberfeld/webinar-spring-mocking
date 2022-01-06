package testingil.webinar.springmocking.s03.lifecycle;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserLogic.UL_Normal;
import testingil.webinar.springmocking.UserRepository;

import static org.mockito.Mockito.mock;

@Configuration
class Config_MockNormalUL {
    @Bean
    public UL_Normal ul_normal(){
        return mock(UL_Normal.class);
    }

    @Bean
    public UserRepository userRepository(){
        return mock(UserRepository.class);
    }
}
