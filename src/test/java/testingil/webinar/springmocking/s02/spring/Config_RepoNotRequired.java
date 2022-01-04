package testingil.webinar.springmocking.s02.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;
import testingil.webinar.springmocking.UserLogic.UL_NotRequiredAccessibleRepository;

@Configuration
public class Config_RepoNotRequired {
    @Bean
    public UL_NotRequired ul_notRequired() {
        return new UL_NotRequired();
    }

    @Bean
    public UL_NotRequiredAccessibleRepository ul_notRequired_withaccessiblerepo() {
        return new UL_NotRequiredAccessibleRepository();
    }


}
