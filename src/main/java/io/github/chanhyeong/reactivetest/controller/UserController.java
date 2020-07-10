package io.github.chanhyeong.reactivetest.controller;

import io.github.chanhyeong.reactivetest.domain.*;
import io.github.chanhyeong.reactivetest.service.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@RequiredArgsConstructor
public class UserController {
	private static final String USER_ID = "test";

	private final UserCommands userCommands;
	private final UserQueries userQueries;

	@GetMapping("/user")
	public Mono<User> getUser() {
		return userQueries.getUser(USER_ID);
	}

	@GetMapping("/createUser")
	public Mono<User> createUser() {
		return userCommands.create(USER_ID);
	}
}
