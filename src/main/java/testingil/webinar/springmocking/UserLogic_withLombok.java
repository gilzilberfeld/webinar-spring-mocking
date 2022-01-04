package testingil.webinar.springmocking;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class UserLogic_withLombok {

    @Autowired
    UserRepository repository;

    public boolean validateUser(Long id) {
        Optional<User> user = repository.findById(id);
        return validate(user.get());
    }

    private boolean validate(User user) {
        return user.getFirstName().contains("Gil");
    }
}
