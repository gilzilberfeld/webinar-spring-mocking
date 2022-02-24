package testingil.webinar.springmocking.s02.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_NotRequiredAccessibleRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes ={Config_NotRequiredRepoUL.class})
public class E03_AccessibleNonRequiredRepo {

    @Autowired
    UL_NotRequiredAccessibleRepository logic;

    @Test
    public void gil_is_ok_again(){
        UserRepository mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        logic.repository = mockRep;
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }
}
