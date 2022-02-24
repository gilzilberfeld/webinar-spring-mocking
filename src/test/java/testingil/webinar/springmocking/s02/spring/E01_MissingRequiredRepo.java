package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes ={Config_RequiredRepositoryUL.class})
public class E01_MissingRequiredRepo {

    @Autowired
    UL_RequiredRepository logic;

    @Test
    public void gil_is_not_ok(){
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }
}
