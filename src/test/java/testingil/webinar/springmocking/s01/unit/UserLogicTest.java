package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.*;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserLogicTest {

    private UserRepository mockRep;

    @Test
    public void gil_is_ok() {
        UserLogic logic = new UserLogic();
        assertTrue(logic.validateUser(TestConstants.GIL_ID));
    }

    @Test
    public void gil_is_ok_with_mock(){
        create_mock_user_with("Gil");
        UserLogic_WithAccessibleRepository logic = new UserLogic_WithAccessibleRepository();
        logic.repository = mockRep;
        assertTrue(logic.validateUser(TestConstants.GIL_ID));
    }

    private void create_mock_user_with(String name) {
        mockRep = mock(UserRepository.class);
        User mockUser = new User(){{setFirstName(name);}};
        when(mockRep.findById(anyLong())).thenReturn(Optional.of(mockUser));
    }
}
