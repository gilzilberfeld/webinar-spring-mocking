package testingil.webinar.springmocking.s07.databases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import testingil.webinar.springmocking.*;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration(classes = {Config_ControllerLogic.class, Config_JPA_H2.class})
@Transactional
@AutoConfigureMockMvc
@TestPropertySource(locations = {"classpath:application-test.properties"})
class E02_InMemoryDB {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    UserRepository repository;

//    @BeforeEach
//    public void setup(){
//    //    mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
//    }

    @Test
    public void validUser() throws Exception {
        Assertions.assertNotNull(repository);
//        User user = new User();
//        user.setFirstName("Gil");
//        entityManager.persist(user);
//        entityManager.flush();

        mockMvc.perform(
                get("/users/validate/")
                .param("id", TestHelpers.GIL_ID.toString()))
                .andExpect(status().isOk());
    }

//    @Test
//    public void invalidUser() throws Exception {
//        User user = new User();
//        user.setFirstName("Gil");
////        entityManager.persist(user);
////        entityManager.flush();
//        mockMvc.perform(
//                        get("/users/validate/")
//                                .param("id", TestHelpers.GIL_ID.toString()))
//                .andExpect(status().isNotFound());
//    }

}
