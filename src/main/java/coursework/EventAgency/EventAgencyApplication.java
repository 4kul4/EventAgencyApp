package coursework.EventAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "coursework.EventAgency.*")
@ComponentScan(basePackages = "coursework.EventAgency.*")
@EnableTransactionManagement

public class EventAgencyApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventAgencyApplication.class, args);
	}
}