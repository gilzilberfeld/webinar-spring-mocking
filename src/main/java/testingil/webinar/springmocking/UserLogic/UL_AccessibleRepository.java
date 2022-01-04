package testingil.webinar.springmocking.UserLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testingil.webinar.springmocking.User;
import testingil.webinar.springmocking.UserRepository;

import java.util.Optional;

@Component
public class UL_AccessibleRepository {

    @Autowired
    public UserRepository repository;

    public boolean validateUser(Long id) {
        Optional<User> user = repository.findById(id);
        return validate(user.get());
    }

    private boolean validate(User user) {
        return user.getFirstName().contains("Gil");
    }
}
