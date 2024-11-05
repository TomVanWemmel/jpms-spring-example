package red.jackal.training.spring.jpms.service;

import red.jackal.training.spring.jpms.api.ExampleData;

import java.util.List;

public interface ExampleService {
    ExampleData getExample(long id);

    List<ExampleData> getAllExamples();

    ExampleData addExample(String name);
}
