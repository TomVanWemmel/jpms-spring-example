package red.jackal.training.spring.jpms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"red.jackal.training.spring.jpms.config", "red.jackal.training.spring.jpms.service", "red.jackal.training.spring.jpms.web"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

