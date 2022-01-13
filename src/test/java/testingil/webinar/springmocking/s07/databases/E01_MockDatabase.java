package testingil.webinar.springmocking.s07.databases;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.User;
import testingil.webinar.springmocking.UserRepository;
import testingil.webinar.springmocking.s04.api.Config_ControllerAndLogic;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes= {Config_ControllerAndLogic.class, Config_MockDatabase.class})
@AutoConfigureMockMvc
class E01_MockDatabase {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void validUser() throws Exception {
        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isOk());
    }

    @Test
    public void invalidUser() throws Exception {
        mockMvc.perform(
                        get("/users/validate/")
                                .param("id", TestHelpers.NOT_GIL_ID.toString()))
                .andExpect(status().isNotFound());
    }
}
