package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_AccessibleRepository;
import testingil.webinar.springmocking.UserLogic.UL_Coupled;
import testingil.webinar.springmocking.UserLogic.UL_Lombok;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class E03_AccessibleRepository {

    private UserRepository mockRep;

    @Test
    public void gil_is_ok(){
        mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        UL_AccessibleRepository logic = new UL_AccessibleRepository();
        logic.repository = mockRep;
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }
}
