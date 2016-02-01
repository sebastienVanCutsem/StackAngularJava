package be.oniryx.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by sebas on 31-01-16.
 */
@RestController
public class UIApplication {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
