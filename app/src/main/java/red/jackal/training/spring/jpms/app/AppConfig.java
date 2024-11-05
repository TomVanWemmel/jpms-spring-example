package red.jackal.training.spring.jpms.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import red.jackal.training.spring.jpms.config.DataConfig;
import red.jackal.training.spring.jpms.repository.ExampleRepository;
import red.jackal.training.spring.jpms.service.ExampleService;
import red.jackal.training.spring.jpms.service.impl.DefaultExampleService;

@Import({DataConfig.class})
public class AppConfig {

    @Bean
    public ExampleService exampleService(ExampleRepository exampleRepository) {
        return new DefaultExampleService(exampleRepository);
    }

}
