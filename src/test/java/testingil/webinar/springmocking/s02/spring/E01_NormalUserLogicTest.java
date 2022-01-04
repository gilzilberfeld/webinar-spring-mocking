package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_Normal;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes ={Config_NormalUL.class})
public class E01_NormalUserLogicTest {

    @Autowired
    UL_Normal logic;

    @Test
    public void gil_is_not_ok(){
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }
}
