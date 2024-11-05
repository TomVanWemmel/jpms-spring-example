package red.jackal.training.spring.jpms.api;

import java.util.List;
import java.util.Optional;

public interface ExampleRepository {
    Optional<? extends ExampleData> findById(long id);

    List<ExampleData> findAll();

    ExampleData save(ExampleData exampleData);
}
