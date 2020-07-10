package io.github.chanhyeong.reactivetest.service;

import io.github.chanhyeong.reactivetest.domain.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import reactor.core.publisher.*;

import java.time.*;

@Service
@RequiredArgsConstructor
public class UserCommands {
	private final UserRepository userRepository;

	@Transactional
	public Mono<User> create(String userId) {
		return userRepository.save(User.of(userId, userId + 1, LocalDateTime.now()));
	}
}
