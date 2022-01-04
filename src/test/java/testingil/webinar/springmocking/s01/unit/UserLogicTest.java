package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.*;
import testingil.webinar.springmocking.UserLogic.UL_AccessibleRepository;
import testingil.webinar.springmocking.UserLogic.UL_Coupled;
import testingil.webinar.springmocking.UserLogic.UL_Normal;
import testingil.webinar.springmocking.UserLogic.UL_Lombok;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserLogicTest {

    private UserRepository mockRep;

    @Test
    public void gil_is_not_ok() {
        UL_Coupled logic = new UL_Coupled();
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }

    @Test
    public void gil_is_really_not_ok() {
        UL_Normal logic = new UL_Normal();
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }

    @Test
    public void gil_is_ok_with_mock(){
        mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        UL_AccessibleRepository logic = new UL_AccessibleRepository();
        logic.repository = mockRep;
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }

    @Test
    public void gil_is_ok_with_mock_too(){
        mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        UL_Lombok logic = new UL_Lombok(mockRep);
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }

}
