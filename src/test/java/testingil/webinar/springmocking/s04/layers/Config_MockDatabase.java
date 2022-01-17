package testingil.webinar.springmocking.s04.layers;

import org.springframework.context.annotation.Bean;
import testingil.webinar.springmocking.UserRepository;

public class Config_MockDatabase {
    @Bean
    public UserRepository userRepository(){
        return new MockDatabase();
    }
}
