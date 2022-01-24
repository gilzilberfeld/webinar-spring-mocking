package testingil.webinar.springmocking;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestHelpers {
    public static final Long GIL_ID = Long.valueOf(3);
    public static final Long NOT_GIL_ID =Long.valueOf(6);
    public static final Long ANY_ID = Long.valueOf(10);

    public static UserRepository create_ֵmock_user_with(String name) {
        UserRepository mockRepo = mock(UserRepository.class);
        User mockUser = new User(){{setFirstName(name);}};
        when(mockRepo.findById(anyLong())).thenReturn(Optional.of(mockUser));
        return mockRepo;
    }

}
