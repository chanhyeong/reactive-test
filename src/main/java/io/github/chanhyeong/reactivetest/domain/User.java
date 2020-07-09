package io.github.chanhyeong.reactivetest.domain;

import lombok.*;
import org.springframework.data.annotation.*;

import java.time.*;

@Getter
@AllArgsConstructor(staticName = "of")
public class User {

	@Id
	private String id;
	private String name;
	private LocalDateTime createdAt;
}
