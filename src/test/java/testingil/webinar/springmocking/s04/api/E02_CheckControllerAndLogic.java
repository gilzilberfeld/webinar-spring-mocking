package testingil.webinar.springmocking.s04.api;

import org.checkerframework.checker.nullness.Opt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.User;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;
import testingil.webinar.springmocking.UserRepository;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes= {Config_ControllerAndLogic.class})
@AutoConfigureMockMvc
class E02_CheckControllerAndLogic {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserRepository mockRepository;

    @Test
    public void validUser() throws Exception {
        User user = new User();
        user.setFirstName("Gil");
        Optional<User> mockUser =Optional.of(user);
        when(mockRepository.findById(anyLong()))
                .thenReturn(mockUser);
        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isOk());
    }

    @Test
    public void invalidUser() throws Exception {
        User user = new User();
        user.setFirstName("Lig");
        Optional<User> mockUser =Optional.of(user);
        when(mockRepository.findById(anyLong()))
                .thenReturn(mockUser);
        mockMvc.perform(
                        get("/users/validate/")
                                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isNotFound());
    }
}
