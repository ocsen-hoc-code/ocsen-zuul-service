package org.ocsen.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OcsenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcsenApplication.class, args);
	}

}
