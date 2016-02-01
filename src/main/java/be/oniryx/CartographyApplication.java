package be.oniryx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


/*Equals @Configuration @EnableAutoConfiguration @ComponentScan*/
@SpringBootApplication
public class CartographyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartographyApplication.class, args);
	}
}
