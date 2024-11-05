package red.jackal.training.spring.jpms.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import red.jackal.training.spring.jpms.DataConfig;
import red.jackal.training.spring.jpms.api.ExampleRepository;
import red.jackal.training.spring.jpms.service.ExampleService;
import red.jackal.training.spring.jpms.service.impl.DefaultExampleService;
import red.jackal.training.spring.jpms.web.WebConfig;

@Configuration
@Import({DataConfig.class, WebConfig.class})
public class AppConfig {

    @Bean
    public ExampleService exampleService(ExampleRepository exampleRepository) {
        return new DefaultExampleService(exampleRepository);
    }

}
