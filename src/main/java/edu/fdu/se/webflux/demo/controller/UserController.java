package edu.fdu.se.webflux.demo.controller;

import edu.fdu.se.webflux.demo.domain.User;
import edu.fdu.se.webflux.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Tag(name = "用户服务")
@RequestMapping("/api/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Operation(summary = "查询一个用户")
    @GetMapping("/one")
    public Mono<User> getOneUser() {
        return userService.getOneUser();
    }

    @Operation(summary = "查询所有用户")
    @GetMapping("/all")
    public Flux<User> getAllUser() {
        return userService.getAllUser();
    }
}
