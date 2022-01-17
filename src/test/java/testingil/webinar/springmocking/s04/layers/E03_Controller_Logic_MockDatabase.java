package testingil.webinar.springmocking.s04.layers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import testingil.webinar.springmocking.TestHelpers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes= {Config_ControllerAndLogic.class, Config_MockDatabase.class})
@AutoConfigureMockMvc
class E03_Controller_Logic_MockDatabase {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void gil_is_ok() throws Exception {
        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isOk());
    }

    @Test
    public void lig_is_not_ok() throws Exception {
        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.NOT_GIL_ID.toString()))
                .andExpect(status().isNotFound());
    }
}
