package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_AccessibleRepository;
import testingil.webinar.springmocking.UserLogic.UL_NotRequiredAccessibleRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes ={Config_RepoNotRequired.class})
public class E03_UserLogicTest_RepoNotRequiredAndAccessible {

    @Autowired
    UL_NotRequiredAccessibleRepository logic;

    @Test
    public void gil_is_ok_again(){
        UserRepository mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        logic.repository = mockRep;
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }
}
