package testingil.webinar.springmocking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import testingil.webinar.springmocking.UserLogic.UL_Normal;

@RestController
public class UserController {

    @Autowired
    UL_Normal logic;


}
