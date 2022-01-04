package testingil.webinar.springmocking.UserLogic;

import org.springframework.stereotype.Component;
import testingil.webinar.springmocking.RepositoryAdapter;
import testingil.webinar.springmocking.User;
import testingil.webinar.springmocking.UserRepository;

import java.util.Optional;

@Component
public class UL_Coupled {

    public boolean validateUser(Long id) {
        UserRepository repository = new RepositoryAdapter() ;
        Optional<User> user = repository.findById(id);
        return validate(user.get());
    }

    private boolean validate(User user) {
        return user.getFirstName().contains("Gil");
    }
}
