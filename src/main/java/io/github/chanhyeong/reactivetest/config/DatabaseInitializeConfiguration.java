package io.github.chanhyeong.reactivetest.config;

import io.r2dbc.spi.*;
import org.springframework.context.annotation.*;
import org.springframework.core.io.*;
import org.springframework.data.r2dbc.connectionfactory.init.*;

@Configuration
public class DatabaseInitializeConfiguration {

	@Bean
	public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);

		CompositeDatabasePopulator populator = new CompositeDatabasePopulator();
		populator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

		initializer.setDatabasePopulator(populator);

		return initializer;
	}
}
