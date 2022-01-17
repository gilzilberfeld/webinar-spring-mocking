package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_AccessibleRepository;
import testingil.webinar.springmocking.UserLogic.UL_Lombok;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;
import testingil.webinar.springmocking.UserRepository;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class E02_RequiredRepository {

    @Test
    public void gil_is_not_ok() {
        UL_RequiredRepository logic = new UL_RequiredRepository();
        assertTrue(logic.validateUser(TestHelpers.GIL_ID));
    }

}
