package testingil.webinar.springmocking.s01.unit;

import org.junit.jupiter.api.Test;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_Coupled;

import static org.assertj.core.api.Assertions.assertThat;


public class E01_CoupledRepository {

    @Test
    public void gil_is_not_ok() {
        UL_Coupled logic = new UL_Coupled();
        assertThat(logic.validateUser(TestHelpers.GIL_ID)).isTrue();
    }

}
