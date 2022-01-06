package testingil.webinar.springmocking.s03.lifecycle;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_Normal;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ContextConfiguration(classes ={Config_MockNormalUL.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class E01_Singleton {

    @Autowired
    UL_Normal mockLogic;

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
