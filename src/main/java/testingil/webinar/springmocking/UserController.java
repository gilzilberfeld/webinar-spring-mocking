package testingil.webinar.springmocking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testingil.webinar.springmocking.UserLogic.UL_NotRequired;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UL_NotRequired logic;

    @GetMapping(value = "validate/")
    public ResponseEntity isValidUser(@RequestParam Long id) {
        var result =logic.validateUser(id);
        if (result)
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.notFound().build();
    }

}
