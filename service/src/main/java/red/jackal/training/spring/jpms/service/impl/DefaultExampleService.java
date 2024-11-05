package red.jackal.training.spring.jpms.service.impl;

import red.jackal.training.spring.jpms.api.ExampleData;
import red.jackal.training.spring.jpms.api.ExampleRepository;
import red.jackal.training.spring.jpms.service.ExampleService;

import java.util.List;
import java.util.NoSuchElementException;

public class DefaultExampleService implements ExampleService {

    private final ExampleRepository exampleRepository;

    public DefaultExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public ExampleData getExample(long id) {
        return exampleRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Example with id %s not found".formatted(id)));
    }

    @Override
    public List<ExampleData> getAllExamples() {
        return exampleRepository.findAll();
    }

    @Override
    public ExampleData addExample(String name) {
        return exampleRepository.save(new ExampleData() {
            @Override
            public Long id() {
                throw new UnsupportedOperationException("ID is forbidden");
            }

            @Override
            public String name() {
                return name;
            }
        });
    }
}
