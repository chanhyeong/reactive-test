package io.github.chanhyeong.reactivetest.domain;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.domain.*;

import java.time.*;

@Getter
@AllArgsConstructor(staticName = "of")
public class User implements Persistable<String> {

	@Id
	private final String id;
	private final String name;
	private final LocalDateTime createdAt;

	@Transient
	@Getter(AccessLevel.PACKAGE)
	private final boolean newEntity = true;

	@Override
	public boolean isNew() {
		return newEntity;
	}
}
