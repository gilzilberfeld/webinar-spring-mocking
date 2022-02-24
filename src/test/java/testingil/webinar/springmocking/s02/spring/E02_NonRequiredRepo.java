package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes ={Config_NotRequiredRepoUL.class})
public class E02_NonRequiredRepo {

    @Autowired
    UL_NotRequired logic;

    @Test
    public void gil_is_still_not_ok_but_for_a_different_reason(){
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }
}
