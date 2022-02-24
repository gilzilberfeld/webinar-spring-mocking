package testingil.webinar.springmocking.s03.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ContextConfiguration(classes ={Config_Mock_UL_Repo.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class E05_DirtiesContext {

    // Because Repo Is Required
    // Need to supply in the Config
    // Even if it is not used

    @Autowired
    UL_RequiredRepository mockLogic;

    @Test
    public void test_one_call() {
        mockLogic.validateUser(TestHelpers.GIL_ID);
        verify(mockLogic).validateUser(anyLong());
    }

    @Test
    public void test_zero_calls() {
        verify(mockLogic, never()).validateUser(anyLong());
    }
}
