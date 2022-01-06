package testingil.webinar.springmocking.s04.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import testingil.webinar.springmocking.TestHelpers;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes= {Config_ControllerOnly.class})
@AutoConfigureMockMvc
class E01_CheckControllerOnly {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UL_NotRequired mockLogic;

    @Test
    public void validUser() throws Exception {
        when(mockLogic.validateUser(anyLong()))
                .thenReturn(true);
        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isOk());
    }

    @Test
    public void invalidUser() throws Exception {
        when(mockLogic.validateUser(anyLong()))
                .thenReturn(false);
        mockMvc.perform(
                        get("/users/validate/")
                                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isNotFound());
    }
}
