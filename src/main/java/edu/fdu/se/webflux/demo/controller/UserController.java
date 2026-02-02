package edu.fdu.se.webflux.demo.controller;

import edu.fdu.se.webflux.demo.domain.User;
import edu.fdu.se.webflux.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("/api/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/one")
    public Mono<User> getOneUser() {
        return userService.getOneUser();
    }

    @GetMapping("/all")
    public Flux<User> getAllUser() {
        return userService.getAllUser();
    }
}
