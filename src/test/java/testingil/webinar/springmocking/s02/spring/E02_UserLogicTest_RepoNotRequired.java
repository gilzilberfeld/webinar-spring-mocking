package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes ={Config_RepoNotRequired.class})
public class E02_UserLogicTest_RepoNotRequired {

    @Autowired
    UL_NotRequired logic;

    @Test
    public void gil_is_less_not_ok(){
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }
}
