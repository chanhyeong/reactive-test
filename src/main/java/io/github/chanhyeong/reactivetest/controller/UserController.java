package io.github.chanhyeong.reactivetest.controller;

import io.github.chanhyeong.reactivetest.domain.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@Controller
@AllArgsConstructor(access = AccessLevel.PRIVATE, staticName = "of")
public class UserController {

	@GetMapping("/user")
	public Mono<User> getUser() {
		return Mono.empty();
	}
}
