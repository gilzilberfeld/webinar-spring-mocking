package testingil.webinar.springmocking.s03.lifecycle;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ContextConfiguration(classes ={Config_Empty.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E04_MockBean {

    @MockBean
    UL_RequiredRepository mockLogic;

    @Test
    @Order(1)
    public void one_call() {
        mockLogic.validateUser(TestHelpers.GIL_ID);
        verify(mockLogic).validateUser(anyLong());
    }

    @Test
    @Order(2)
    public void zero_calls() {
        verify(mockLogic, never()).validateUser(anyLong());
    }

}
