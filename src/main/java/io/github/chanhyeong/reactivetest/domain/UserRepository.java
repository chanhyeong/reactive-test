package io.github.chanhyeong.reactivetest.domain;

import org.springframework.data.r2dbc.repository.*;

public interface UserRepository extends R2dbcRepository<User, String> {
}