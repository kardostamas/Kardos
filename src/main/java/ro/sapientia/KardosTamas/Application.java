package ro.sapientia.KardosTamas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EnableJpaAuditing

@ComponentScan("ro.sapientia.KardosTamas")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}