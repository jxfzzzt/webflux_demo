package edu.fdu.se.webflux.demo.service;

import edu.fdu.se.webflux.demo.domain.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserService {

    public Mono<User> getOneUser() {
        return Mono.just(new User("root", "root"));
    }

    public Flux<User> getAllUser() {
        User user1 = new User("user1", "pass1");
        User user2 = new User("user2", "pass2");

        return Flux.fromIterable(List.of(user1, user2));
    }
}
