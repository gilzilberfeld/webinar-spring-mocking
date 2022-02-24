package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_RequiredRepository;

import static org.assertj.core.api.Assertions.assertThat;


public class E02_RequiredRepository {

    @Test
    public void gil_is_not_ok() {
        UL_RequiredRepository logic = new UL_RequiredRepository();
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }
}
