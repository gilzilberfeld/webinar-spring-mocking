package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_Lombok;
import testingil.webinar.springmocking.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;


public class E04_InjectedWithLombok {

    private UserRepository mockRep;

    @Test
    public void gil_is_ok(){
        mockRep = TestHelpers.create_ֵmock_user_with("Gil");
        UL_Lombok logic = new UL_Lombok(mockRep);
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }

}
