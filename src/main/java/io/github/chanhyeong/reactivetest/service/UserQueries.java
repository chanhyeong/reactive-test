package io.github.chanhyeong.reactivetest.service;

import io.github.chanhyeong.reactivetest.domain.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import reactor.core.publisher.*;

import java.time.*;

@Service
@RequiredArgsConstructor
public class UserQueries {
	private final UserRepository userRepository;

	public Mono<User> getUser(String id) {
		return userRepository.findById(id);
	}

	@Transactional
	public Mono<User> save(String id) {
		User.of(id, "name", LocalDateTime.now());
		return userRepository.findById(id);
	}
}
